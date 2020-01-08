package com.redhat.coolstore.productcataloglab1;

import org.junit.jupiter.api.Test;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.beans.factory.annotation.Autowired;
import com.redhat.coolstore.productcataloglab1.service.ProductCatalogService;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@SpringBootTest
@ActiveProfiles("dev")
class ProductCatalogLab1ApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testDefaultProductList() {
		String message = productCatalogService.sayhello();
		assertTrue(message!=null);
		assertEquals(message,"Hey Developer!");
	}

	@Autowired
	ProductCatalogService productCatalogService; 
	
}
