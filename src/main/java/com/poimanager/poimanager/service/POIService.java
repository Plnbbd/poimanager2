package com.poimanager.poimanager.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.poimanager.poimanager.model.POI;


@Service
public class POIService {
    private final RestTemplate restTemplate;
    
    // @Value("${nodejs.api.base-url}")
    // private String baseUrl;
    private final String baseUrl = "https://api-donnees-explomboa.onrender.com";

    public POIService(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    public List<POI> getAllPOIs() {
        ResponseEntity<POI[]> response = restTemplate.getForEntity(baseUrl + "/pois", POI[].class);
        return Arrays.asList(response.getBody());
    }

    public POI getPOIById(Long id) {
        return restTemplate.getForObject(baseUrl + "/pois/" + id, POI.class);
    }

    public List<POI> getPoisByCategory(Long categoryId) {
        String url = baseUrl + "/pois?category=" + categoryId;
        ResponseEntity<POI[]> response = restTemplate.getForEntity(url, POI[].class);
        return Arrays.asList(response.getBody());
    }
    
}

