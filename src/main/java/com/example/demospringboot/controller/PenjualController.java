package com.example.demospringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.demospringboot.entity.Penjual;
import com.example.demospringboot.service.PenjualService;

import jakarta.servlet.http.HttpSession;
import java.util.Optional;

@Controller
public class PenjualController {

    @Autowired
    private PenjualService penjualService;

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String loginSubmit(@RequestParam String username,
                              @RequestParam String password,
                              HttpSession session,
                              Model model) {

        Optional<Penjual> penjualOpt = penjualService.login(username, password);

        if (penjualOpt.isPresent()) {
            session.setAttribute("logPenjual", penjualOpt.get());
            return "redirect:/pelanggan"; // login berhasil, langsung ke page pakaian
        } else {
            model.addAttribute("error", "Username atau Password salah");
            return "login";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}
