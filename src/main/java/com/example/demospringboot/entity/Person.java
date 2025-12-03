 /*
  * Class Person
  * Author: Carla Etenia Gunawidjaja
  * NIM: 825240127
  * Date: 20 November 2025
  */

package com.example.demospringboot.entity;

import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Id;

@MappedSuperclass
public abstract class Person {

    @Id
    private int noHP;  // primary key

    private String email;

    public Person() {}

    public Person(int noHP, String email) {
        this.noHP = noHP;
        this.email = email;
    }

    public int getNoHP() { return noHP; }
    public void setNoHP(int noHP) { this.noHP = noHP; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public abstract String getRole();
    public abstract void UserData();
}
