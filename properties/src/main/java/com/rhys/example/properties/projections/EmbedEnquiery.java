package com.rhys.example.properties.projections;

import com.rhys.example.properties.models.Bidder;
import com.rhys.example.properties.models.Enquiery;
import com.rhys.example.properties.models.Property;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name= "embedProperty", types = Bidder.class)
public interface EmbedEnquiery {

    String getEmail();
    String getName();
    public List<Enquiery> getEnquieries();

}
