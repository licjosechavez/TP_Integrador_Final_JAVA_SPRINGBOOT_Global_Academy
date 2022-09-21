package com.global.TP_Final_Integrador.service;

import com.global.TP_Final_Integrador.Singleton.CategoriesSingleton;
import com.global.TP_Final_Integrador.model.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CategoryService {

    public ArrayList<Category> addCategory(Category category){
        CategoriesSingleton cs = CategoriesSingleton.getInstance();
        ArrayList<Category> categories = cs.getCategories();
        categories.add(category);
        cs.setCategories(categories);
        return categories;
    }
}
