package com.rhys.example.properties.models;

import javax.persistence.*;

@Entity
@Table(name = "enquieries")
public class Enquiery {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "bidder_id", nullable=false)
    private Bidder bidder;

    @Column
    private String datePosted;

    @ManyToOne
    @JoinColumn(name = "property_id", nullable=false)
    private Property property;

    public Enquiery(Bidder user, String datePosted, Property property) {
        this.bidder = user;
        this.datePosted = datePosted;
        this.property = property;
    }

    public Enquiery() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(String datePosted) {
        this.datePosted = datePosted;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public Bidder getUser() {
        return bidder;
    }

    public void setUser(Bidder user) {
        this.bidder = user;
    }

}

