package com.example.demospringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demospringboot.entity.Pelanggan;
import com.example.demospringboot.repository.PelangganRepository;

@Service
public class PelangganService {

    @Autowired
    private PelangganRepository repository;

    public List<Pelanggan> getAllPelanggan() {
        return repository.findAll();
    }

    public void addPelanggan(Pelanggan pelanggan) {
        repository.save(pelanggan);
    }

    public void updatePelanggan(int noHP, Pelanggan pelanggan) {
        if(repository.existsById(noHP)) {
            repository.save(pelanggan);
        }
    }

    public void deletePelanggan(int noHP) {
        repository.deleteById(noHP);
    }
    
    public Pelanggan findById(int noHP) {
    return repository.findById(noHP).orElse(null);
}

}
