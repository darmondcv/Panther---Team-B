package com.example.Charitan.Backend.API.Charity;

import com.example.Charitan.Backend.DTO.CharityRegistrationRequest;
import com.example.Charitan.Backend.DataModel.Charity;
import com.example.Charitan.Backend.API.Charity.CharityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CharityService {

    @Autowired
    private CharityRepository charityRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    // Create new charity
    public Charity registerCharity(CharityRegistrationRequest charityRegistrationRequest){

        // check if email existed
        if(charityRepository.findByEmail(charityRegistrationRequest.getEmail()).isPresent()) {
            throw new RuntimeException("A charity has been registered with this email");
        }

        Charity charity = new Charity();
        charity.setOrganizationName(charityRegistrationRequest.getOrganizationName());
        charity.setDescription(charityRegistrationRequest.getDescription());
        charity.setCategory(charityRegistrationRequest.getCategory());
        charity.setEmail(charityRegistrationRequest.getEmail());
        charity.setPassword(passwordEncoder.encode(charityRegistrationRequest.getPassword()));
        charity.setAvatar(charityRegistrationRequest.getAvatar());
        charity.setCountry(charityRegistrationRequest.getCountry());
        charity.setCreatedAt(LocalDateTime.now());
        charity.setUpdatedAt(LocalDateTime.now());

        return charityRepository.save(charity);
    }
}
