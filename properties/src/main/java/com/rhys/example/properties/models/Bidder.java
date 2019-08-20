package com.rhys.example.properties.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.rhys.example.properties.models.Enquiery;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "bidders")
public class Bidder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String email;

    @Column
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy="bidder", fetch = FetchType.LAZY)
    private List<Enquiery> enquieries;

    public Bidder(String email, String name) {
        this.email = email;
        this.name = name;
        this.enquieries = new ArrayList<>();
    }

    public Bidder() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Enquiery> getEnquieries() {
        return enquieries;
    }

    public void setEnquieries(List<Enquiery> enquieries) {
        this.enquieries = enquieries;
    }

    public void addEnquiery(Enquiery enquiery) {
        this.enquieries.add(enquiery);
    }
}
