package com.rhys.example.properties.repositories;

import com.rhys.example.properties.models.Bidder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource
public interface BidderRepository extends JpaRepository<Bidder, Long> {
}
