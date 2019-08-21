package com.rhys.example.properties.projections;

import com.rhys.example.properties.models.Bidder;
import com.rhys.example.properties.models.Enquiery;
import com.rhys.example.properties.models.Property;
import org.springframework.data.rest.core.config.Projection;

@Projection(name= "Embedbidder", types = Enquiery.class)
public interface EmbedProperty {

    Long getId();
    String getDatePosted();
    Property getProperty();
    Bidder getBidder();
}
