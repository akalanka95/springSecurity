package com.epiclanka.supportTest.service;

import com.epiclanka.supportTest.model.User;

import java.util.List;

public interface UserService {
    User save(User user);

    List<User> findAll();

    User getUserByEmail(String email);
}
