package com.rhys.example.properties.components;

import com.rhys.example.properties.models.Enquiery;
import com.rhys.example.properties.models.Property;
import com.rhys.example.properties.models.Bidder;
import com.rhys.example.properties.repositories.EnquieryRepository;
import com.rhys.example.properties.repositories.PropertyRepository;
import com.rhys.example.properties.repositories.BidderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    EnquieryRepository enquieryRepository;

    @Autowired
    PropertyRepository propertyRepository;

    @Autowired
    BidderRepository userRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) {

        Bidder bidder1 = new Bidder("blah@bla.com", "James Brown");
        userRepository.save(bidder1);

        Bidder bidder2 = new Bidder("hi@world.com", "Eva Diva");
        userRepository.save(bidder2);

        Bidder bidder3 = new Bidder("foo@bar.com", "Ricky Martin");
        userRepository.save(bidder3);

        Property property1 = new Property("2 bedroom detached house for sale", "Llanddeusant, Holyhead, Sir Ynys Mon, LL65",
                "If you have ever dreamt of converting an historic Welsh Chapel into your dream home ...",
                "12-03-2019", "front of houseImage", "Guide Price £125,000");
        propertyRepository.save(property1);

        Property property2 = new Property("Studio flat for sale", "Flat 1, 53 Station Road, Deganwy, Conwy, LL31", "Yaga are pleased to present this 1 bedroom flat to market. Close to the town centre and on a bus route, makes this property a must view. This property is ready to move into and offers spacious living in a secure building. In brief, the property comp...", "19-04-2018", "Image3", "£90,000 ONO");
        propertyRepository.save(property2);

        Property property3 = new Property("One bedroom beach side shack", "1 Beach view walk, Beach Rd, BB12 1aq", "This spacious semi detached bungalow is situated in a quiet cul-de-sac location, convenient for local schools. There is excellent....", "12-3-2018", "picture here", "Offers above £1,000,000");
        propertyRepository.save(property3);

        Enquiery enquiery1 = new Enquiery(bidder1, "12-04-2019", property1);
        enquieryRepository.save(enquiery1);

        Enquiery enquiery2 = new Enquiery(bidder2, "22-05-2019", property2);
        enquieryRepository.save(enquiery2);

        Enquiery enquiery3 = new Enquiery(bidder3, "20-9-2012", property1);
        enquieryRepository.save(enquiery3);

        Enquiery enquiery4 = new Enquiery(bidder3, "19-9-2019", property2);
        enquieryRepository.save(enquiery4);


    }
}
