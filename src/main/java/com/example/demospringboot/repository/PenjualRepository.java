package com.example.demospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demospringboot.entity.Penjual;
import java.util.Optional;

public interface PenjualRepository extends JpaRepository<Penjual, Integer> {
    Optional<Penjual> findByUsernameAndPassword(String username, String password);
}
