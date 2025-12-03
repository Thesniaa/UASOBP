package com.example.demospringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.demospringboot.entity.Pakaian;
import com.example.demospringboot.service.PakaianService;

@Controller
@RequestMapping("/pakaian")
public class PakaianController {

    @Autowired
    private PakaianService pakaianService;

    @GetMapping
    public String showForm(Model model) {
        model.addAttribute("pakaianRec", new Pakaian());
        model.addAttribute("pakaianList", pakaianService.getAll());
        return "pakaian"; // file HTML: pakaian.html
    }

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute Pakaian pakaian) {
        pakaianService.save(pakaian);
        return "redirect:/pakaian";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        pakaianService.delete(id);
        return "redirect:/pakaian";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        Pakaian pakaian = pakaianService.findById(id);
        model.addAttribute("pakaianRec", pakaian);
        model.addAttribute("pakaianList", pakaianService.getAll());
        return "pakaian";
    }
}
