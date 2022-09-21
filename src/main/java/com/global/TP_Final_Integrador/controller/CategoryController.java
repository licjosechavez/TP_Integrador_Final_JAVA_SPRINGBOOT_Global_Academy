package com.global.TP_Final_Integrador.controller;

import com.global.TP_Final_Integrador.model.Category;
import com.global.TP_Final_Integrador.service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CategoryController {

    final CategoryService service;

    public CategoryController(CategoryService service) {
        this.service = service;
    }

    @PostMapping(
            value = "/categories",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    public ResponseEntity<ArrayList<Category>> postCategory(@RequestBody Category category)
    {
        ArrayList<Category> categories = service.addCategory(category);
        return new ResponseEntity<>(categories, HttpStatus.CREATED);
    }
}
