package com.bezkoder.spring.jwt.mongodb.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.spring.jwt.mongodb.models.Profile;
import com.bezkoder.spring.jwt.mongodb.repository.ProfileRepository;

import java.util.List;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    public Profile createProfile(Profile profile) {
        return profileRepository.save(profile);
    }

    public List<Profile> getAllProfiles() {
        return profileRepository.findAll();
    }

    public Profile getProfileById(String id) {
        return profileRepository.findById(id).orElse(null);
    }

    public void deleteProfile(String id) {
        profileRepository.deleteById(id);
    }
}
