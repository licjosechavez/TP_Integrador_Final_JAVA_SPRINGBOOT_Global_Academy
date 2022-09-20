package com.global.TP_Final_Integrador.model;

public class Category {

    public String name;
    public String subCategory;

    //constructs

    public Category() {
    }

    public Category(String name, String subCategory) {
        this.name = name;
        this.subCategory = subCategory;
    }

    //getters y setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    //toString


    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", subCategory='" + subCategory + '\'' +
                '}';
    }
}
