package com.bezkoder.spring.jwt.mongodb.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "profiles")
public class Profile {
    @Id
    private String id;

    private String name;
    private int age;
    private String description;
    private String imageBase64;

    // Getters and Setters
    public String getId() {
        return id;
      }
    
      public void setId(String id) {
        this.id = id;
      }

      public String getName() {
        return name;
      }
    
      public void setName(String name) {
        this.name = name;
      }
}
