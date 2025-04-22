package com.example.TP3_JAVAEE;

import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductRepositoryReactif {
    public static Map<Long, Product> produits = new HashMap<>();

    Mono<Product> save(Product product) {
        produits.put(product.getId(), product);
        return Mono.justOrEmpty(product);
    }

    Mono<Product> findById(Long id) {
        return Mono.justOrEmpty(produits.get(id));
    }

    Flux<Product> findAll() {
        return Flux.fromIterable(produits.values());
    }

    Mono<Product> delete(Long id){
        return Mono.justOrEmpty(produits.remove(id));
    }
}
