package com.example.demospringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demospringboot.entity.Pakaian;
import com.example.demospringboot.repository.PakaianRepository;

@Service
public class PakaianService {

    @Autowired
    private PakaianRepository repo;

    public List<Pakaian> getAll() {
        return repo.findAll();
    }

    public void save(Pakaian pakaian) {
        repo.save(pakaian);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public Pakaian findById(Long id) {
        return repo.findById(id).orElse(null);
    }
}
