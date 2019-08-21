package com.rhys.example.properties.repositories;

import com.rhys.example.properties.models.Enquiery;
import com.rhys.example.properties.models.Property;
import com.rhys.example.properties.projections.EmbedEnquiery;
import com.rhys.example.properties.projections.EmbedProperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
@RepositoryRestResource(excerptProjection = EmbedProperty.class)
public interface EnquieryRepository extends JpaRepository<Enquiery, Long> {

}
