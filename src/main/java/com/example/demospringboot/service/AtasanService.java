package com.example.demospringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demospringboot.entity.Atasan;
import com.example.demospringboot.repository.AtasanRepository;

@Service
public class AtasanService {
    @Autowired private AtasanRepository repo;
    public List<Atasan> getAll() { return repo.findAll(); }
}
