package com.bezkoder.spring.jwt.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bezkoder.spring.jwt.mongodb.models.Profile;

public interface ProfileRepository extends MongoRepository<Profile, String> {
}
