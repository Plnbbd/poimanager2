package com.poimanager.poimanager.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.poimanager.poimanager.model.Category;

@Service
public class CategoryService {
    private final RestTemplate restTemplate;
    private final String BASE_URL = "https://api-donnees-explomboa.onrender.com"; 

    public CategoryService(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    public List<Category> getAllCategories() {
        ResponseEntity<Category[]> response = restTemplate.getForEntity(BASE_URL + "/categories", Category[].class);
        return Arrays.asList(response.getBody());
    }
}
