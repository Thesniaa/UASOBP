package com.example.demospringboot.controller;

import com.example.demospringboot.entity.Bawahan;
import com.example.demospringboot.repository.BawahanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/bawahan")
public class BawahanController {

    @Autowired
    private BawahanRepository bawahanRepository;

    @GetMapping
    public String listBawahan(Model model) {
        model.addAttribute("bawahanList", bawahanRepository.findAll());
        model.addAttribute("bawahanRec", new Bawahan());
        return "bawahan";
    }

    @PostMapping("/submit")
    public String submitBawahan(@ModelAttribute Bawahan bawahan) {
        bawahanRepository.save(bawahan);
        return "redirect:/bawahan";
    }

    @GetMapping("/edit/{id}")
    public String editBawahan(@PathVariable Long id, Model model) {
        Bawahan bawahan = bawahanRepository.findById(id).orElse(new Bawahan());
        model.addAttribute("bawahanRec", bawahan);
        model.addAttribute("bawahanList", bawahanRepository.findAll());
        return "bawahan";
    }

    @GetMapping("/delete/{id}")
    public String deleteBawahan(@PathVariable Long id) {
        bawahanRepository.deleteById(id);
        return "redirect:/bawahan";
    }
}
