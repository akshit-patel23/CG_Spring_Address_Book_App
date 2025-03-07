package com.example.addressbook.model;

import jakarta.persistence.*;

@Entity
@Table(name = "addressbook")
public class AddressBookModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    private String phone;
    private String email;

    public AddressBookModel(){

    }
    public AddressBookModel(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public Long getId() {
        return Id;
    }
}