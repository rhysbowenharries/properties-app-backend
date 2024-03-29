package com.rhys.example.properties.repositories;

import com.rhys.example.properties.models.Enquiery;
import com.rhys.example.properties.models.Property;
import com.rhys.example.properties.projections.EmbedBidder;
import com.rhys.example.properties.projections.EmbedEnquiery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource()
public interface PropertyRepository extends JpaRepository<Property, Long> {
}
