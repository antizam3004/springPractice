package com.antizam.jkp.model;

import com.antizam.jkp.model.address.Address;


public class Customer extends SimpleEntity{

    private String firstName;
    private String lastName;
    private Address address;
    private String email;
    private Zone zone;
    private String note;
    private boolean isActive;
    private CustomerType customerType;
    private CustomerCategory customerCategory;
    private String unique_id;

    public Customer() {

    }
}
