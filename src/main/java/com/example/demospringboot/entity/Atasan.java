 /*
  * Class 
  * Author: Stephanie Angeline
  * NIM: 825240071
  * Date: 18 November 2025
  */

package com.example.demospringboot.entity;

import jakarta.persistence.Entity;

@Entity

public class Atasan extends Pakaian {

    private String jenisLengan;

    public Atasan() {}

    public String getJenisLengan() { return jenisLengan; }
    public void setJenisLengan(String jenisLengan) { this.jenisLengan = jenisLengan; }
}
