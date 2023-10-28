package com.pairlearning.expensetrackerapiMaven.repositories;

import com.pairlearning.expensetrackerapiMaven.domain.Transaction;
import com.pairlearning.expensetrackerapiMaven.exception.EtBadRequestException;
import com.pairlearning.expensetrackerapiMaven.exception.EtResourceNotFoundException;

import java.util.List;

public interface TransactionRepository {
    List<Transaction> findAll(Integer userId,Integer categoryId);

    Transaction findById(Integer userId,Integer categoryId,Integer transactionId) throws EtResourceNotFoundException;
    Integer create(Integer userId,Integer categoryId,Double amount,String note,long transactionDate )throws EtBadRequestException;
    void update(Integer userId,Integer categoryId,Integer transactionId,Transaction transaction)throws EtBadRequestException;
    void removeById(Integer userId,Integer categoryId,Integer transactionId) throws EtResourceNotFoundException;

}
