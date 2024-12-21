package com.example.Charitan.Backend.API.Charity;

import com.example.Charitan.Backend.DataModel.Charity;
import com.example.Charitan.Backend.API.Charity.CharityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/charities")
public class CharityController {

    @Autowired
    private CharityService charityService;

    //Endpoint register charity
    @PostMapping("/register")
    public ResponseEntity<?> registerCharity(@RequestBody Charity charity){
        try {
            Charity savedCharity = charityService.registerCharity(charity);
            return ResponseEntity.ok(savedCharity);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
