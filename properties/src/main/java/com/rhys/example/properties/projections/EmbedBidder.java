package com.rhys.example.properties.projections;

import com.rhys.example.properties.models.Bidder;
import com.rhys.example.properties.models.Property;
import org.springframework.data.rest.core.config.Projection;

@Projection(name= "EmbedBidder", types = Property.class)
public interface EmbedBidder {
    String getTitleDescription();
    String getAddress();
    String getMainDescription();
    String getDateAdded();
    String getImage();
    String getPrice();

}
