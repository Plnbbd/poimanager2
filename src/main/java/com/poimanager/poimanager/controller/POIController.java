package com.poimanager.poimanager.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poimanager.poimanager.model.POI;
import com.poimanager.poimanager.service.POIService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/pois")
public class POIController {
    private final POIService poiService;

    public POIController(POIService poiService) {
        this.poiService = poiService;
    }

    @GetMapping
    public List<POI> getAllPOIs() {
        return poiService.getAllPOIs();
    }

    @GetMapping("/{id}")
    public POI getPOI(@PathVariable Long id) {
        return poiService.getPOIById(id);
    }
}
