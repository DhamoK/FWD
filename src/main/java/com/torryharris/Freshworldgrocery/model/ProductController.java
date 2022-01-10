package com.torryharris.Freshworldgrocery.model;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller

public class ProductController {

    @Autowired
    private ProductService service;
    private final Logger LOG = LoggerFactory.getLogger(this.getClass());


    @GetMapping("/products")
    public String showProductList(Model model){
        List<Products> listProduct=service.listAll();
        model.addAttribute("listProducts", listProduct);
        return "products";
    }

    @GetMapping ("/new")
    public String addProperty(Model model){
        Products prod=new Products();
        model.addAttribute("product", prod);
        //model.addAttribute("pageTitle", "Add New Property");
        return "addProduct";
    }

    @PostMapping("/save")
    public String saveProduct(Products products, RedirectAttributes ra){
        service.save(products);
        ra.addFlashAttribute("message","The user has been saved successfully");
        return "redirect:/products";
    }

    @GetMapping("/products/edit/{id}")
    public String editProducts(@PathVariable("id") Integer id, Model model){
        Products prod=service.get(id);
        model.addAttribute("product", prod);
        model.addAttribute("pageTitle", "Edit Product (ID: "+id+")");
        return "updateProduct";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") Integer id, RedirectAttributes ra){
        try{
            service.delete(id);
            ra.addFlashAttribute("message", "The Product ID "+id+" has been deleted.");
        }
        catch (UserPrincipalNotFoundException e){
            ra.addFlashAttribute("message", e.getMessage());
        }
        return "redirect:/products";
    }

    @RequestMapping("/vegetables")
    public String vegetables() {
        return "vegetables";
    }

    @RequestMapping("/userLogin")
    public String usrLogin() {
        return "login1";
    }

    @RequestMapping("/signup")
    public String signup() {
        return "signup1";
    }

    @RequestMapping("/groceryList")
    public String groceryList() {
        return "display";
    }

    @RequestMapping("/adminDashboard")
    public String admin() {
        return "adminDash";
    }


}