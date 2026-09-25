package com.isabilalli.crean.user;

import java.lang.foreign.Linker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.isabilalli.crean.user.dto.*;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    private UserResponse toResponse(User user){
        return new UserResponse(user.getId(), user.getFirstName(), user.getLastName(), user.getUsername());
    }

    public List<UserResponse> getAllUsers(){
        return userRepository.findAll().stream().map(this::toResponse).toList();
    }

    public Optional<UserResponse> createUser(CreateUserRequest request){
        
    }
}
