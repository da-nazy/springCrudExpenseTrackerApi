package com.pairlearning.expensetrackerapiMaven.repositories;


import com.pairlearning.expensetrackerapiMaven.domain.User;
import com.pairlearning.expensetrackerapiMaven.exception.ETAuthException;

public interface UserRepository {

    Integer create(String firstName, String lastName, String email, String password) throws ETAuthException;
    User findByEmailAndPassword(String email,String password) throws ETAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userId);
}
