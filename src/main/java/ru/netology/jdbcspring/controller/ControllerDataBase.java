package ru.netology.jdbcspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.netology.jdbcspring.service.ServiceDataBase;

import java.util.List;

@Controller
public class ControllerDataBase {
    private ServiceDataBase serviceDataBase;

    public ControllerDataBase(ServiceDataBase serviceDataBase) {
        this.serviceDataBase = serviceDataBase;
    }

    @GetMapping("/products/fetch-product")
    @ResponseBody
    public List<String> getProductName(@RequestParam("name") String customerName) {
        return serviceDataBase.getProducts(customerName);
    }
}
