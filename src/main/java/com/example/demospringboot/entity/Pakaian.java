 /*
  * Class Pakaian
  * Author: Stephanie Angeline
  * NIM: 825240071
  * Date: 18 November 2025
  */


package com.example.demospringboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient; 


@Entity
public class Pakaian {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ukuran;
    private String warna;
    private String brand;
    private String bahan;

    public Pakaian() {}

    // Getter & Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    @Transient
public String getDeskripsi() {
    if (this instanceof Atasan) {
        return ((Atasan) this).getJenisLengan();
    } else if (this instanceof Bawahan) {
        return ((Bawahan) this).getWaistType();
    } else if (this instanceof Luaran) {
        return ((Luaran) this).getInsulation();
    } 
    return "";
}

}
