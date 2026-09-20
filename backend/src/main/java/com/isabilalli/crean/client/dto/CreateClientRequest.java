package com.isabilalli.crean.client.dto;

import jakarta.validation.constraints.Email;

public class CreateClientRequest {

    private String name;
    private String phoneNumber;
    @Email(message= "Invalid Email Format")
    private String email;

    public CreateClientRequest() {
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}