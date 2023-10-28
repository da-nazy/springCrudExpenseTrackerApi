package com.pairlearning.expensetrackerapiMaven.services;


import com.pairlearning.expensetrackerapiMaven.domain.User;
import com.pairlearning.expensetrackerapiMaven.exception.ETAuthException;

public interface UserService {

    // validate user
    // register user
    User validateUser(String email,String password) throws ETAuthException;
    User registerUser(String firstName, String lastName, String email, String password) throws ETAuthException;
}
