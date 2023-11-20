package com.example.demo.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;


    public List<User> findAll() {

        return userRepository.findAll();
    }


public User findById(Long id) {

   return userRepository.findById(id).get();
}

    public List<User> deleteById(Long id) {

       userRepository.delete(userRepository.findById(id).get());
       return userRepository.findAll();

    }

    public User save(User user) {
    return  userRepository.save(user);


    }

}
