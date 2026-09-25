package com.isabilalli.crean.user;

import jakarta.persistence.*;

@Entity 
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String hashPassword;

    public User(String firstName, String lastName, String username, String hashPassword){
        this.firstName=firstName;
        this.lastName=lastName;
        this.username=username;
        this.hashPassword=hashPassword;
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

    public String getHashPassword(){
        return hashPassword;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public void setUsername(String username){
        this.username=username;
    }

    public void setHashPassword(String hash){
        this.hashPassword=hash;
    }
}