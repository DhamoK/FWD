package com.torryharris.Freshworldgrocery.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.Optional;
@Service
public class ProductService {
    @Autowired
    private ProductRepository repo;

    public List<Products> listAll(){

        return (List<Products>) repo.findAll();
    }

    public void save(Products products) {

        repo.save(products);
    }

    public Products get(Integer id){
        Optional<Products> result=repo.findById(id);
        Products products=null;
        if(result.isPresent()){
            products=result.get();
        }
        else{
            throw new RuntimeException("Products not foound for id " + id);
        }
        return products;
    }

    public void delete(Integer id) throws UserPrincipalNotFoundException {
        // Long count=repo.countById(id);
        //if(count==null || count==0){
        //    throw new UserPrincipalNotFoundException("Could not find Property with ID "+ id);
        //}
        repo.deleteById(id);
    }
}