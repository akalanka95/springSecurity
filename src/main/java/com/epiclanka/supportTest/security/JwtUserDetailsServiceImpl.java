package com.epiclanka.supportTest.security;


import com.epiclanka.supportTest.repository.UserRepository;
import com.epiclanka.supportTest.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsServiceImpl implements UserDetailsService {

        @Autowired private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByEmailIgnoreCase(username);
        if(user == null){
            throw  new  UsernameNotFoundException(String.format("No user Found with username '%s'." , username) );
        }else {
                return JwtuserFactory.create(user);
        }
    }
}
