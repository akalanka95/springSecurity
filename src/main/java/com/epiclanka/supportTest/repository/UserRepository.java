package com.epiclanka.supportTest.repository;

import com.epiclanka.supportTest.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    public User findByEmailIgnoreCase(String username);

}
