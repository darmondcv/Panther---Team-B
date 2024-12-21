package com.example.Charitan.Backend.DataModel;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import com.example.Charitan.Backend.Enum.charityCategory;


@Entity
@Table(name = "Charity")
public class Charity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id auto increment
    @Column(name = "charity_id")
    private Long charityId;

    @Column(name = "organization_name", length = 255, nullable = false)
    private String organizationName;

    @Column(name = "description" , columnDefinition = "TEXT")
    private String description;

    // Enum
    @Enumerated(EnumType.STRING)
    @Column(name = "category", nullable = false)
    private charityCategory category;

    @Column(name = "email", length = 150, nullable = false, unique = true)
    private String email;

    @Column(name = "password", length = 255, nullable = false)
    private String password;

    @Column(name = "avatar", length = 255)
    private String avatar;

    @Column(name = "country", length = 45)
    private String country;

    @Column(name = "createdAt", updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updatedAt")
    private LocalDateTime updatedAt;

    public Charity() {
    }

    public Long getCharityId() {
        return charityId;
    }

    public void setCharityId(Long charityId) {
        this.charityId = charityId;
    }

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

    public charityCategory getCategory() {
        return category;
    }

    public void setCategory(charityCategory category) {
        this.category = category;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
