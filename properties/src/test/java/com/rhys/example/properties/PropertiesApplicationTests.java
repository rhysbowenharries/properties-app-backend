package com.rhys.example.properties;

import com.rhys.example.properties.repositories.EnquieryRepository;
import com.rhys.example.properties.repositories.PropertyRepository;
import com.rhys.example.properties.repositories.BidderRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesApplicationTests {

	@Autowired
	EnquieryRepository enquieryRepository;

	@Autowired
	PropertyRepository propertyRepository;

	@Autowired
	BidderRepository userRepository;

	@Test
	public void contextLoads() {
	}

}
