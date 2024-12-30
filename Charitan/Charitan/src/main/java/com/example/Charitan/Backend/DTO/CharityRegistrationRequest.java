package com.example.Charitan.Backend.DTO;

import com.example.Charitan.Backend.Enum.charityCategory;


public class CharityRegistrationRequest {

    private String organizationName;
    private String description;
    private charityCategory category;
    private String email;
    private String password;
    private String avatar;
    private String country;

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public charityCategory getCategory() {
        return category;
    }

    public void setCategory(charityCategory category) {
        this.category = category;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
