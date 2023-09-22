package com.antizam.jkp.model.address;

import jakarta.persistence.*;

import java.math.BigInteger;

@Entity
@Table(name="addresses")
public class Address {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private BigInteger id;

    @ManyToOne
    private Country country;

    @ManyToOne
    private City city;

    @ManyToOne
    private Street street;

    @Column(name = "house_number")
    private String houseNumber;

    public Address() {
    }

    public BigInteger getId() {
        return id;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }
}
