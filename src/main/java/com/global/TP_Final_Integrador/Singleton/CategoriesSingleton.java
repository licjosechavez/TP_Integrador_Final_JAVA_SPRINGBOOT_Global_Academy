package com.global.TP_Final_Integrador.Singleton;

import com.global.TP_Final_Integrador.model.*;

import java.util.ArrayList;

public final class CategoriesSingleton {

    private static CategoriesSingleton INSTANCE;
    private ArrayList<Category> categories;


    //construct
    public CategoriesSingleton() {

        categories = new ArrayList<>();
        categories.add(new Category("Harina", "Leudante"));
        categories.add(new Category("Sal", "Gruesa"));
        categories.add(new Category("Fideo", "Tirabuzones"));
    }

    public static  CategoriesSingleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new CategoriesSingleton();
        }
        return INSTANCE;
    }

    public ArrayList<Category> getCategories(){
        return categories;
    }

    public void setCategories(ArrayList<Category> categories){
        this.categories = categories;
    }
}