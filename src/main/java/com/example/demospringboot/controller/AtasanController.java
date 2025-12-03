package com.example.demospringboot.controller;

import com.example.demospringboot.entity.Atasan;
import com.example.demospringboot.repository.AtasanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/atasan")
public class AtasanController {

    @Autowired
    private AtasanRepository atasanRepository;

    @GetMapping
    public String listAtasan(Model model) {
        model.addAttribute("atasanList", atasanRepository.findAll());
        model.addAttribute("atasanRec", new Atasan());
        return "atasan";
    }

    @PostMapping("/submit")
    public String submitAtasan(@ModelAttribute Atasan atasan) {
        atasanRepository.save(atasan);
        return "redirect:/atasan";
    }

    @GetMapping("/edit/{id}")
    public String editAtasan(@PathVariable Long id, Model model) {
        Atasan atasan = atasanRepository.findById(id).orElse(new Atasan());
        model.addAttribute("atasanRec", atasan);
        model.addAttribute("atasanList", atasanRepository.findAll());
        return "atasan";
    }

    @GetMapping("/delete/{id}")
    public String deleteAtasan(@PathVariable Long id) {
        atasanRepository.deleteById(id);
        return "redirect:/atasan";
    }
}
