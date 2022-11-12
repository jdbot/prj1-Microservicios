package com.nttdata.banco.controller;

import com.nttdata.banco.model.Transaction;
import com.nttdata.banco.service.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    private ITransactionService TransactionService;

    @GetMapping
    public Flux<Transaction> findAll(){
        return TransactionService.findAll();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Transaction> register(@RequestBody Transaction Transaction){
        return  TransactionService.register(Transaction);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Transaction> modify(@RequestBody Transaction Transaction){
        return  TransactionService.update(Transaction);
    }

    @GetMapping("/{id}")
    public Mono<Transaction> findById(@PathVariable("id") String id){
        return TransactionService.findById(id);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable("id") String id){
        return TransactionService.delete(id);
    }
}
