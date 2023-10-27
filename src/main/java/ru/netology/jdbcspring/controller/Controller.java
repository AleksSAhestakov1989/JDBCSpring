package ru.netology.jdbcspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.netology.jdbcspring.service.Service;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    private Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/products/fetch-product")
    @ResponseBody
    public List<String> getProductName(@RequestParam("name") String customerName) {
        return service.getProducts(customerName);
    }
}
