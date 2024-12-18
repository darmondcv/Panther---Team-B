package com.example.Charitan.Backend.API.Donor;

import com.example.Charitan.Backend.DataModel.Donor;
import com.example.Charitan.Backend.API.Donor.DonorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class DonorService {

    @Autowired
    private DonorRepository donorRepository;

    //Register new Donor
    public Donor registerDonor (Donor donor){
        if(donorRepository.findByEmail(donor.getEmail()).isPresent()){
            throw new RuntimeException("A donor with this email already exists.");
        }

        donor.setCreatedAt(LocalDateTime.now());
        donor.setUpdatedAt(LocalDateTime.now());

        // Ensure donorType is valid
        if (donor.getDonorType() == null || donor.getDonorType().isBlank()) {
            donor.setDonorType("INDIVIDUAL"); // Default to a valid ENUM value
        } else if (!donor.getDonorType().equals("INDIVIDUAL")
                && !donor.getDonorType().equals("ORGANIZATION")) {
            throw new IllegalArgumentException("Invalid donorType. Allowed values are 'INDIVIDUAL' or 'ORGANIZATION'.");
        }

        return donorRepository.save(donor);
    }


}
