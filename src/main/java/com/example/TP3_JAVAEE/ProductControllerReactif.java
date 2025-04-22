/*
package com.example.TP3_JAVAEE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ProductControllerReactif {
    @Autowired
    ProductRepositoryReactif repository;

    @RequestMapping(value = "/product", method = RequestMethod.POST)
    public Mono<Product> save(@RequestBody Product product) {
        return repository.save(product);
    }

    @RequestMapping(value = "/product", method = RequestMethod.PUT)
    public Mono<Product> update(@RequestBody Product product) {
        return repository.save(product);
    }

    @RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
    public Mono<Product> getById(@PathVariable long id) {
        return repository.findById(id);
    }

    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public Flux<Product> getAll() {
        return repository.findAll();
    }

    @RequestMapping(value = "/product/{id}", method = RequestMethod.DELETE)
    public Mono<Product> delete(@PathVariable long id) {
        return repository.delete(id);
    }
}
*/