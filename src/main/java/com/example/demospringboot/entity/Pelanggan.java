 /*
  * Class Pelanggan
  * Author: Carla Etenia Gunawidjaja
  * NIM: 825240127
  * Date: 20 November 2025
  */

package com.example.demospringboot.entity;

import jakarta.persistence.Entity;

@Entity
public class Pelanggan extends Person {

    private boolean membership;

    public Pelanggan() {}

    public Pelanggan(int noHP, String email, boolean membership) {
        super(noHP, email);
        this.membership = membership;
    }

    public boolean getMembership() { return membership; }
    public void setMembership(boolean membership) { this.membership = membership; }

    @Override
    public String getRole() { return "Pelanggan"; }

    @Override
    public void UserData() {
        System.out.println("No HP: " + getNoHP() + ", Email: " + getEmail() + ", Membership: " + membership);
    }
}
