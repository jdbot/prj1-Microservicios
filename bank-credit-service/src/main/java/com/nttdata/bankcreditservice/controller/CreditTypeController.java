package com.nttdata.bankcreditservice.controller;

import com.nttdata.bankcreditservice.document.CreditType;
import com.nttdata.bankcreditservice.service.CreditTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/creditType")
public class CreditTypeController {

    @Autowired
    private CreditTypeService creditTypeService;

    @GetMapping()
    public Flux<CreditType> findAll(){
        return creditTypeService.findAll();
    }

    @PostMapping("/register")
    public Mono<CreditType> register(@RequestBody CreditType creditType) {
        return creditTypeService.register(creditType);
    }

    @PostMapping("/update")
    public Mono<CreditType> update(@RequestBody CreditType creditType) {
        return creditTypeService.update(creditType);
    }

    @GetMapping("/{id}")
    public Mono<CreditType> findById(@PathVariable("id") String id){
        return creditTypeService.findById(id);
    }
}
