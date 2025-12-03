package com.example.demospringboot.controller;

import com.example.demospringboot.entity.Luaran;
import com.example.demospringboot.repository.LuaranRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/luaran")
public class LuaranController {

    @Autowired
    private LuaranRepository luaranRepository;

    @GetMapping
    public String listLuaran(Model model) {
        model.addAttribute("luaranList", luaranRepository.findAll());
        model.addAttribute("luaranRec", new Luaran());
        return "luaran";
    }

    @PostMapping("/submit")
    public String submitLuaran(@ModelAttribute Luaran luaran) {
        luaranRepository.save(luaran);
        return "redirect:/luaran";
    }

    @GetMapping("/edit/{id}")
    public String editLuaran(@PathVariable Long id, Model model) {
        Luaran luaran = luaranRepository.findById(id).orElse(new Luaran());
        model.addAttribute("luaranRec", luaran);
        model.addAttribute("luaranList", luaranRepository.findAll());
        return "luaran";
    }

    @GetMapping("/delete/{id}")
    public String deleteLuaran(@PathVariable Long id) {
        luaranRepository.deleteById(id);
        return "redirect:/luaran";
    }
}
