package com.antizam.jkp.model.address;

import com.antizam.jkp.model.SimpleEntity;
import jakarta.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name="cities")
public class City extends SimpleEntity {

    @Column(name="postal_code")
    private int postalCode;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @OneToMany
    private ArrayList<Street> streets;

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public ArrayList<Street> getStreets() {
        return streets;
    }

    public void setStreets(ArrayList<Street> streets) {
        this.streets = streets;
    }
}
