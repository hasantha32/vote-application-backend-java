package com.bezkoder.spring.jwt.mongodb.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.spring.jwt.mongodb.models.Voting;
import com.bezkoder.spring.jwt.mongodb.repository.VotingRepository;

import java.util.List;
import java.util.Optional;

@Service
public class VotingService {

    @Autowired
    private VotingRepository votingRepository;

    public Voting voteForProfile(String profileId, String userId) {
        Optional<Voting> existingVote = votingRepository.findByProfileIdAndUserId(profileId, userId);
        if (existingVote.isPresent()) {
            throw new RuntimeException("User has already voted for this profile");
        }

        Voting voting = new Voting();
        voting.setProfileId(profileId);
        voting.setUserId(userId);

        return votingRepository.save(voting);
    }

    public List<Voting> getAllVotes() {
        return votingRepository.findAll();
    }

    public List<Voting> getVotesByProfileId(String profileId) {
        return votingRepository.findAll();
    }
}