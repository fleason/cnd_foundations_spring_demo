package com.redhat.coolstore.productcataloglab1.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ProductCatalogService {

	@GetMapping("/products")
	public String sayhello() {
		return message;
		}
	
	@Value("${coolstore.message:Hello World!}")
	private String message;
	
	}