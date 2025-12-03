 /*
  * Class 
  * Author: Stephanie Angeline
  * NIM: 825240071
  * Date: 18 November 2025
  */

package com.example.demospringboot.entity;

import jakarta.persistence.Entity;

@Entity
public class Bawahan extends Pakaian {

    private String waistType;

    public Bawahan() {}

    public String getWaistType() { return waistType; }
    public void setWaistType(String waistType) { this.waistType = waistType; }
}
