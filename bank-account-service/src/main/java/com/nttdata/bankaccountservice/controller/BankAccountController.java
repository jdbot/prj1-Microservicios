package com.nttdata.bankaccountservice.controller;

import com.nttdata.bankaccountservice.document.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    @ResponseStatus(HttpStatus.OK)
    public Flux<BankAccount> findAll(){
        return bankAccountService.findAll();
    }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<BankAccount> register(@RequestBody BankAccount bankAccount) {
        return bankAccountService.register(bankAccount);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public Mono<BankAccount> update(@RequestBody BankAccount bankAccount) {
        return bankAccountService.update(bankAccount);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<BankAccount> findById(@PathVariable("id") String id){
        return bankAccountService.findById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<Void> delete(@PathVariable("id") String id){
        return bankAccountService.delete(id);
    }

}
