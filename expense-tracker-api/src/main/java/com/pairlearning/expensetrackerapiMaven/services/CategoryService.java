package com.pairlearning.expensetrackerapiMaven.services;

import com.pairlearning.expensetrackerapiMaven.domain.Category;
import com.pairlearning.expensetrackerapiMaven.exception.EtBadRequestException;
import com.pairlearning.expensetrackerapiMaven.exception.EtResourceNotFoundException;

import java.util.List;

public interface CategoryService {

    List<Category> fetchAllCategories(Integer userid);
    Category fetchCategoryById(Integer userId,Integer categoryId)throws EtResourceNotFoundException;
    Category addCategory(Integer userId,String title,String description) throws EtBadRequestException;

    void updateCategory(Integer userId,Integer categoryId,Category category)throws EtBadRequestException;

    void removeCategoryWithAllTransactions(Integer userId,Integer categoryId) throws EtResourceNotFoundException;
}
