 /*
  * Class Penjual
  * Author: Carla Etenia Gunawidjaja
  * NIM: 825240127
  * Date: 20 November 2025
  */

package com.example.demospringboot.entity;

import jakarta.persistence.Entity;

@Entity
public class Penjual extends Person implements Login {

    private String username;
    private String password;

    public Penjual() {}

    public Penjual(int noHP, String email, String username, String password) {
        super(noHP, email);
        this.username = username;
        this.password = password;
    }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    @Override
    public String getRole() { return "Penjual"; }

    @Override
    public void UserData() {
        System.out.println("No HP: " + getNoHP() + ", Email: " + getEmail() + ", Username: " + username);
    }

    @Override
    public void login() {
        // bisa diisi logic login nanti, atau kosong dulu
        System.out.println("Login method dari Penjual dipanggil");
    }
}
