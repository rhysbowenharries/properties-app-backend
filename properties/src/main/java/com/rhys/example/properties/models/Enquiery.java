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

    public Enquiery(Bidder bidder, String datePosted, Property property) {
        this.bidder = bidder;
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

    public Bidder getBidder() {
        return bidder;
    }

    public void setBidder(Bidder bidder) {
        this.bidder = bidder;
    }

}

