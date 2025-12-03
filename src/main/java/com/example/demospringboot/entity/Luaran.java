 /*
  * Class 
  * Author: Stephanie Angeline
  * NIM: 825240071
  * Date: 18 November 2025
  */

package com.example.demospringboot.entity;

import jakarta.persistence.Entity;

@Entity
public class Luaran extends Pakaian {

    private String insulation;

    public Luaran() {}

    public String getInsulation() { return insulation; }
    public void setInsulation(String insulation) { this.insulation = insulation; }
}
