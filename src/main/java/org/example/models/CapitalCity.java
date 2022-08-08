package org.example.models;

import javax.persistence.*;

@Entity
@Table(name = "CapitalCity")

public class CapitalCity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CapitalCity" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    //foreign key mapped to country
    @OneToOne
    private Country country;

}
