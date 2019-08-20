package com.rhys.example.properties.controllers;

import com.rhys.example.properties.repositories.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(value = "/properties")
public class PropertyContoller {

    @Autowired
    PropertyRepository propertyRepository;
}
