package com.cognizant.ormlearn.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @Column(name = "code") // changed from "co_code"
    private String code;

    @Column(name = "name") // changed from "co_name"
    private String name;

    // Getters and Setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Optional: toString() method for debugging
    @Override
    public String toString() {
        return "Country [code=" + code + ", name=" + name + "]";
    }
}
