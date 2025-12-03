package com.example.demospringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.demospringboot.entity.Pelanggan;
import com.example.demospringboot.service.PelangganService;

@Controller
public class PelangganController {

    @Autowired
    private PelangganService pelangganservice;

    @GetMapping("/pelanggan")
    public String pelangganPage(Model model) {
        model.addAttribute("pelangganList", pelangganservice.getAllPelanggan());
        model.addAttribute("pelangganRec", new Pelanggan());
        return "pelanggan";
    }

    @PostMapping("/pelanggan/submit")
    public String submitPelanggan(@ModelAttribute("pelangganRec") Pelanggan pelanggan,
                                  @RequestParam(required = false) String edit,
                                  @RequestParam(required = false) String delete) {
        if(edit != null) {
            pelangganservice.updatePelanggan(pelanggan.getNoHP(), pelanggan);
        } else if(delete != null) {
            pelangganservice.deletePelanggan(pelanggan.getNoHP());
        } else {
            pelangganservice.addPelanggan(pelanggan);
        }
        return "redirect:/pelanggan";
    }

    @GetMapping("/pelanggan/edit/{noHP}")
public String editPelanggan(@PathVariable("noHP") int noHP, Model model) {
    Pelanggan p = pelangganservice.findById(noHP);
    model.addAttribute("pelangganRec", p); 
    model.addAttribute("pelangganList", pelangganservice.getAllPelanggan());
    return "pelanggan";
}


    @GetMapping("/pelanggan/delete/{noHP}")
    public String deletePelanggan(@PathVariable("noHP") int noHP) {
        pelangganservice.deletePelanggan(noHP);
        return "redirect:/pelanggan";
    }

}
