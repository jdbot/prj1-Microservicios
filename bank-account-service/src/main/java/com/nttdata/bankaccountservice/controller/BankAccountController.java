package com.nttdata.bankaccountservice.controller;

import com.nttdata.bankaccountservice.document.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import com.nttdata.bankaccountservice.service.BankAccountService;

@RestController
@RequestMapping("/bankAccount")
public class BankAccountController {

    @Autowired
    private BankAccountService bankAccountService;

    @GetMapping()
    public Flux<BankAccount> findAll(){
        return bankAccountService.findAll();
    }

    @PostMapping("/register")
    public Mono<BankAccount> register(@RequestBody BankAccount bankAccount) {
        return bankAccountService.register(bankAccount);
    }

    @PostMapping("/update")
    public Mono<BankAccount> update(@RequestBody BankAccount bankAccount) {
        return bankAccountService.update(bankAccount);
    }

    @GetMapping("/{id}")
    public Mono<BankAccount> findById(@PathVariable("id") String id){
        return bankAccountService.findById(id);
    }


}
