package com.application.repositories;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {

    public final static List<UserDetails> APPLICATION_USERS = Arrays.asList(

            new User("hassan@gmail.com", "123456", Collections.singleton(new SimpleGrantedAuthority("ADMIN"))),
            new User("mustapha@gmail.com", "123456", Collections.singleton(new SimpleGrantedAuthority("CUSTOMER"))),
            new User("kamal@gmail.com", "123456", Collections.singleton(new SimpleGrantedAuthority("SUPPLIER")))

    );

    public UserDetails finUserByEmail(String email){

        return  APPLICATION_USERS.stream().filter(user -> user.getUsername().equals(email)).findFirst().orElseThrow(()->new UsernameNotFoundException("No user was found !!."));

    }

}
