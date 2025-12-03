package com.example.demospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demospringboot.entity.Transaksi;

public interface TransaksiRepository extends JpaRepository<Transaksi, Integer> {
}
