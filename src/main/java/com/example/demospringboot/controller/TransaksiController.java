package com.example.demospringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.demospringboot.entity.*;
import com.example.demospringboot.service.*;

@Controller
public class TransaksiController {

    @Autowired
    private TransaksiService transaksiService;

    @Autowired
    private PakaianService pakaianService;

    @Autowired
    private AtasanService atasanService;

    @Autowired
    private BawahanService bawahanService;

    @Autowired
    private LuaranService luaranService;

    @Autowired
    private PelangganService pelangganService;

    @Autowired
    private PenjualService penjualService;

    @GetMapping("/transaksi")
    public String transaksiPage(Model model) {
        model.addAttribute("transaksiList", transaksiService.getAllTransaksi());
        model.addAttribute("transaksiRec", new Transaksi());

        model.addAttribute("pakaianList", pakaianService.getAll());
        model.addAttribute("atasanList", atasanService.getAll());
        model.addAttribute("bawahanList", bawahanService.getAll());
        model.addAttribute("luaranList", luaranService.getAll());
        model.addAttribute("pelangganList", pelangganService.getAllPelanggan());
        model.addAttribute("penjualList", penjualService.getAllPenjual());

        return "transaksi";
    }

    @PostMapping("/transaksi/submit")
    public String submitTransaksi(@ModelAttribute("transaksiRec") Transaksi transaksi) {
        transaksiService.saveTransaksi(transaksi);
        return "redirect:/transaksi";
        
    }

    @GetMapping("/transaksi/edit/{idTransaksi}")
    public String editTransaksi(@PathVariable("idTransaksi") Integer idTransaksi, Model model) {
        Transaksi t = transaksiService.findById(idTransaksi);

        model.addAttribute("transaksiRec", t);
        model.addAttribute("transaksiList", transaksiService.getAllTransaksi());
        model.addAttribute("pakaianList", pakaianService.getAll());
        model.addAttribute("atasanList", atasanService.getAll());
        model.addAttribute("bawahanList", bawahanService.getAll());
        model.addAttribute("luaranList", luaranService.getAll());
        model.addAttribute("pelangganList", pelangganService.getAllPelanggan());
        model.addAttribute("penjualList", penjualService.getAllPenjual());

        return "transaksi"; 
    }

    @GetMapping("/transaksi/delete/{id}")
    public String deleteTransaksi(@PathVariable("id") Integer id) {
        transaksiService.deleteTransaksi(id);
        return "redirect:/transaksi";
    }
}
