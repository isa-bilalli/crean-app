package com.isabilalli.crean.user.dto;

public class UserResponse {
    public Long id;
    public String firstName;
    public String lastName;
    public String username;

    public UserResponse(Long id, String firstName, String lastName, String username){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.username=username;
    }

    public Long getId(){
        return id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getUsername(){
        return username;
    }
}