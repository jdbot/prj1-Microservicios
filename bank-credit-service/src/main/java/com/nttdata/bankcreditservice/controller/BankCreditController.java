package com.nttdata.bankcreditservice.controller;

import com.nttdata.bankcreditservice.document.BankCredit;
import com.nttdata.bankcreditservice.service.BankCreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/bankCredit")
public class BankCreditController {

    @Autowired
    private BankCreditService bankCreditService;

    @GetMapping()
    public Flux<BankCredit> findAll(){
        return bankCreditService.findAll();
    }

    @PostMapping("/register")
    public Mono<BankCredit> register(@RequestBody BankCredit bankCredit) {
        return bankCreditService.register(bankCredit);
    }

    @PostMapping("/update")
    public Mono<BankCredit> update(@RequestBody BankCredit bankCredit) {
        return bankCreditService.update(bankCredit);
    }

    @GetMapping("/{id}")
    public Mono<BankCredit> findById(@PathVariable("id") String id){
        return bankCreditService.findById(id);
    }

}
