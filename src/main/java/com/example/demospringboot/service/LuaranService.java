package com.example.demospringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demospringboot.entity.Luaran;
import com.example.demospringboot.repository.LuaranRepository;

@Service
public class LuaranService {
    @Autowired private LuaranRepository repo;
    public List<Luaran> getAll() { return repo.findAll(); }
}
