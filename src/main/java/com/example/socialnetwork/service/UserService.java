package com.example.socialnetwork.service;


import com.example.socialnetwork.model.User;
import com.example.socialnetwork.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> getUserByName(String name){
        return userRepository.findAllByName(name);
    }

    public void saveUser(User user){
        userRepository.save(user);
    }



}
