package com.example.Charitan.Backend.API.Charity;

import com.example.Charitan.Backend.DataModel.Charity;
import com.example.Charitan.Backend.API.Charity.CharityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CharityService {

    @Autowired
    private CharityRepository charityRepository;

    // Create new charity
    public Charity registerCharity(Charity charity){
        // check if charity with email exist
        if(charityRepository.findByEmail(charity.getEmail()).isPresent()){
            throw new RuntimeException("A charity with this email already existed.");
        }

        //set the time created
        charity.setCreatedAt(LocalDateTime.now());
        charity.setUpdatedAt(LocalDateTime.now());

        //save to DB
        return charityRepository.save(charity);
    }
}
