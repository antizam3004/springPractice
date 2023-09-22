package com.antizam.jkp.model;

import jakarta.persistence.Column;

public class Company extends Customer{

    @Column(name="tax_number")
    private String taxNumber;
}
