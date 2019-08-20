package com.rhys.example.properties.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.rhys.example.properties.models.Enquiery;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "properties")
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnore
    @OneToMany(mappedBy = "property")
    private List<Enquiery> enquieries;

    @Column
    private String titleDescription;

    @Column
    private String address;

    @Column
    private String mainDescription;

    @Column
    private String dateAdded;

    @Column
    private String image;

    @Column
    private String price;

    public Property(String titleDescription, String address, String mainDescription, String dateAdded, String image, String price) {
        this.titleDescription = titleDescription;
        this.address = address;
        this.mainDescription = mainDescription;
        this.dateAdded = dateAdded;
        this.image = image;
        this.price = price;
        this.enquieries = new ArrayList<>();
    }

    public Property() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEnquieries(List<Enquiery> enquieries) {
        this.enquieries = enquieries;
    }

    public String getTitleDescription() {
        return titleDescription;
    }

    public void setTitleDescription(String titleDescription) {
        this.titleDescription = titleDescription;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMainDescription() {
        return mainDescription;
    }

    public void setMainDescription(String mainDescription) {
        this.mainDescription = mainDescription;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Enquiery> getEnquieries() {
        return enquieries;
    }

    public void addEnquiery(Enquiery enquiery) {
        this.enquieries.add(enquiery);
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
