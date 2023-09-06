package com.meiken.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductContorller {



    @GetMapping("/info")
    @ResponseBody
    public String getProductInfo(){
       return "product info" ;
    }
}
