package com.bezkoder.spring.jwt.mongodb.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "votes")
public class Voting {
    @Id
    private String id;

    private String profileId;
    private String userId;
    public void setProfileId(String _profileId) {
        this.profileId = _profileId;
    }
    public void setUserId(String userId2) {
        this.userId = userId2;
    }

    // Getters and Setters
}
