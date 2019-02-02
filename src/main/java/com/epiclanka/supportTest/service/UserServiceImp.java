package com.epiclanka.supportTest.service;

import com.epiclanka.supportTest.repository.UserRepository;
import com.epiclanka.supportTest.model.User;
import com.epiclanka.supportTest.util.PasswordUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class UserServiceImp implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public User save(User user) {
        String password = PasswordUtil.getPasswordHash(user.getPassword());
        user.setPassword(password);
        user.setCreateDate(new Date());
        return userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.findByEmailIgnoreCase(email);
    }
}
