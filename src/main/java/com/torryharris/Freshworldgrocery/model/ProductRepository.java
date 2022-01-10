package com.torryharris.Freshworldgrocery.model;

import java.util.List;

import com.torryharris.Freshworldgrocery.model.Products;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Products, Integer> {
}
