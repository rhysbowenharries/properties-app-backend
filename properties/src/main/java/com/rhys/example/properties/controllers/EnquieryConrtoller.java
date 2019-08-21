package com.rhys.example.properties.controllers;

import com.rhys.example.properties.models.Enquiery;
import com.rhys.example.properties.models.Property;
import com.rhys.example.properties.repositories.EnquieryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/enquieries")
public class EnquieryConrtoller {

    @Autowired
    EnquieryRepository enquieryRepository;



}
