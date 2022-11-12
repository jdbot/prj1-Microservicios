package com.nttdata.bankaccountservice.util;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CRUD <D>{

    Flux<D> findAll();
    Mono<D> register(D d);
    Mono<D> update(D d);
    Mono<D> findById(String id);
    Mono<Boolean> existsById(String id);
}
