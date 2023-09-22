package com.antizam.jkp.model.address;

import com.antizam.jkp.model.SimpleEntity;
import jakarta.persistence.*;

import java.math.BigInteger;

@Entity
@Table(name="streets")
public class Street extends SimpleEntity {

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
