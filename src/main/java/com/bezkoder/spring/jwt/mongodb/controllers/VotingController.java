package com.bezkoder.spring.jwt.mongodb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.bezkoder.spring.jwt.mongodb.models.Voting;
import com.bezkoder.spring.jwt.mongodb.security.services.VotingService;

import java.security.Principal;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/vote")
public class VotingController {

    @Autowired
    private VotingService votingService;

    @PostMapping("/cast")
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<?> castVote(@RequestParam String profileId, Principal principal) {
        String userId = principal.getName(); // Assuming the username is stored in the principal
        Voting voting = votingService.voteForProfile(profileId, userId);
        return ResponseEntity.ok(voting);
    }

    @GetMapping("/all")
    public List<Voting> getAllVotes() {
        return votingService.getAllVotes();
    }

    @GetMapping("/profile/{profileId}")
    public List<Voting> getVotesByProfileId(@PathVariable String profileId) {
        return votingService.getVotesByProfileId(profileId);
    }

    @GetMapping("/summary/{profileId}")
    public ResponseEntity<?> getVoteSummaryByProfileId(@PathVariable String profileId) {
        List<Voting> votes = votingService.getVotesByProfileId(profileId);
        return ResponseEntity.ok(votes);
    }
}