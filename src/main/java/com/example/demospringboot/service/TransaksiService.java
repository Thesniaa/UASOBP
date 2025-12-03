package com.example.demospringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demospringboot.entity.Transaksi;
import com.example.demospringboot.repository.TransaksiRepository;

@Service
public class TransaksiService {

    @Autowired
    private TransaksiRepository repo;

    public List<Transaksi> getAllTransaksi() {
        return repo.findAll();
    }

    public void saveTransaksi(Transaksi transaksi) {
        repo.save(transaksi);
    }

    public void deleteTransaksi(Integer id) {
        repo.deleteById(id);
    }

    public Transaksi findById(Integer id) {
        return repo.findById(id).orElse(null);
    }
}
