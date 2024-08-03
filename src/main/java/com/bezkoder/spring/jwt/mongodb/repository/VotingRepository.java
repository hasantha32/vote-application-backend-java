package com.bezkoder.spring.jwt.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bezkoder.spring.jwt.mongodb.models.Voting;

import java.util.Optional;

public interface VotingRepository extends MongoRepository<Voting, String> {
    Optional<Voting> findByProfileIdAndUserId(String profileId, String userId);
}
