package com.example.demospringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demospringboot.entity.Bawahan;
import com.example.demospringboot.repository.BawahanRepository;

@Service
public class BawahanService {
    @Autowired private BawahanRepository repo;
    public List<Bawahan> getAll() { return repo.findAll(); }
}
