package com.antizam.jkp.model;

import jakarta.persistence.Column;

public class Tenant extends Customer{
    @Column(name = "members_count")
    private int membersCount;
}
