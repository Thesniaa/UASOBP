package com.example.demospringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demospringboot.entity.Penjual;
import com.example.demospringboot.repository.PenjualRepository;
import java.util.List;
import java.util.Optional;

@Service
public class PenjualService {

    @Autowired
    private PenjualRepository penjualRepository;

    public Optional<Penjual> login(String username, String password) {
        return penjualRepository.findByUsernameAndPassword(username, password);
    }

    public Penjual addPenjual(Penjual p) {
        return penjualRepository.save(p);
    }

    // Tambahkan method ini supaya controller bisa memanggil semua penjual
    public List<Penjual> getAllPenjual() {
        return penjualRepository.findAll();
    }
}
