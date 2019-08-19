package com.rhys.example.properties;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "enquieries")
public class Enquiery {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable=false)
    private User user;

    @Column
    private LocalDate datePosted;

    @ManyToOne
    @JoinColumn(name = "property_id", nullable=false)
    private Property property;

    public Enquiery(Long id, User user, LocalDate datePosted, Property property) {
        this.id = id;
        this.user = user;
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

    public LocalDate getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(LocalDate datePosted) {
        this.datePosted = datePosted;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}

