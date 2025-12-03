package com.example.demospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demospringboot.entity.Luaran;

public interface LuaranRepository extends JpaRepository<Luaran, Long> {}
