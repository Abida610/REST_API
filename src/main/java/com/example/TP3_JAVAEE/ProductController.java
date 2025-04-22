package com.example.TP3_JAVAEE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @Autowired
    ProductRepository repository;

    @RequestMapping(value = "/product", method = RequestMethod.POST)
    public Product save(@RequestBody Product product) {
        return repository.save(product);
    }

    @RequestMapping(value = "/product", method = RequestMethod.PUT)
    public Product update(@RequestBody Product product) {
        return repository.save(product);
    }

    @RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
    public Product getById(@PathVariable long id) {
        return repository.findById(id).orElse(null);
    }

    @RequestMapping(value = "/product/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable long id) {
        repository.deleteById(id);
    }

}
