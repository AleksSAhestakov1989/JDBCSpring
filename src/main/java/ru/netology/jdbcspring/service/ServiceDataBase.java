package ru.netology.jdbcspring.service;

import org.springframework.stereotype.Service;
import ru.netology.jdbcspring.repository.RepositoryDataBase;

import java.util.List;

@Service
public class ServiceDataBase {
    RepositoryDataBase repository;

    public ServiceDataBase(RepositoryDataBase repository) {
        this.repository = repository;
    }

    public List<String> getProducts(String name) {
        return repository.getProductName(name);
    }
}
