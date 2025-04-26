package com.poimanager.poimanager.model;

import lombok.Data;

@Data
public class POI {
    private Long id;
    private String nom;
    private String description;
    private Long quartier_id;
    private Long categorieId;
    private String adress;
    private double latitude;
    private double longitude;
    private int rating;
    private boolean verified;
    private int statut;
    private boolean isBooking;
    private boolean isRestaurant;
    private boolean isTransport;
    private boolean isStadium;
    private boolean isRecommand;
    private String langue;
    private boolean isTranslate;
    private Long user_id;

    // Getters/setters
}
