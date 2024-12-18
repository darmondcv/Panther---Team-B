package com.example.Charitan.Backend.DataModel;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import org.hibernate.annotations.GenericGenerator;
import java.util.UUID;


@Entity
@Table(name = "Donor")
public class Donor {

//    @Id
//    @GeneratedValue(strategy = GenerationType.UUID)
//    @Column(name = "donor_id", updatable = false, nullable = false)
//    private UUID donorId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "donor_id", updatable = false, nullable = false)
    private Long donorId; // Use Long or Integer


    @Column(name = "total_donations")
    private BigDecimal totalDonations;

    @Column(name = "donation_count")
    private Integer donationCount;


    @Column (name = "email", length = 150, nullable = false, unique = true)
    private String email;

    @Column(name = "password", length = 255, nullable = false)
    private String password;

    @Column(name = "phone_number", length = 15)
    private String phoneNumber;

    @Column(name = "address", columnDefinition = "TEXT")
    private String address;

    @Column(name = "avatar", length = 255)
    private String avatar;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updatedAt")
    private LocalDateTime updatedAt;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "paymentDetail", length = 16)
    private String paymentDetail;

    @Column(name = "donor_type")
    private String donorType;

    //Constructor
    public Donor(){}

    //Getter and Setter

    public Long getDonorId() {
        return donorId;
    }

    public void setDonorId(Long donorId) {
        this.donorId = donorId;
    }


//    public UUID getDonorId() {
//        return donorId;
//    }
//
//    public void setDonorId(UUID donorId) {
//        this.donorId = donorId;
//    }

    public BigDecimal getTotalDonations() {
        return totalDonations;
    }

    public void setTotalDonations(BigDecimal totalDonations) {
        this.totalDonations = totalDonations;
    }

    public Integer getDonationCount() {
        return donationCount;
    }

    public void setDonationCount(Integer donationCount) {
        this.donationCount = donationCount;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getPaymentDetail() {
        return paymentDetail;
    }

    public void setPaymentDetail(String paymentDetail) {
        this.paymentDetail = paymentDetail;
    }

    public String getDonorType() {
        return donorType;
    }

    public void setDonorType(String donorType) {
        this.donorType = donorType;
    }
}