package com.isabilalli.crean.client.dto;

public class ClientResponse {
    private Long id;
    private String name;
    private String phoneNumber;
    private String email;

    public ClientResponse(Long id, String name, String phoneNumber, String email) {
        this.id=id;
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.email=email;
    }

    public Long getId(){
        return id;
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
}