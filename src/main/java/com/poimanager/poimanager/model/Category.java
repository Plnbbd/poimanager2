package com.poimanager.poimanager.model;

import lombok.Data;

@Data
public class Category {
    private Long id;
    private String name;
    private String slug;
    private String langue;
    private String icon;
    private int is_translate;
    private Long translate_id;
    private Long parent_id;
}
