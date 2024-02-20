package com.spring.mvc.SpringMvcProject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
//    @GetMapping("/getProduct")
//    public String getProduct(){
//        return "This is testing product url";
//    }

    @GetMapping("/getProduct")
    public String getProduct(
            @RequestParam("productName") String name,
            @RequestParam(value = "productRating", defaultValue = "0", required = false) int rating,
            @RequestParam("productId") int id)
    {
        System.out.println("ProductName : "+ name);
        System.out.println("ProductId : " + id);
        System.out.println("ProductRating : " + rating);

        return "This is testing product url";
    }
}
