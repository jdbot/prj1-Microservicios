package com.nttdata.bankaccountservice.controller;

import com.nttdata.bankaccountservice.document.AccountType;
import com.nttdata.bankaccountservice.document.BankAccount;
import com.nttdata.bankaccountservice.service.AccountTypeService;
import com.nttdata.bankaccountservice.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/accountType")
public class AccountTypeController {

    @Autowired
    private AccountTypeService accountTypeService;

    @GetMapping()
    public Flux<AccountType> findAll(){
        return accountTypeService.findAll();
    }

    @PostMapping("/register")
    public Mono<AccountType> register(@RequestBody AccountType accountType) {
        return accountTypeService.register(accountType);
    }

    @PostMapping("/update")
    public Mono<AccountType> update(@RequestBody AccountType accountType) {
        return accountTypeService.update(accountType);
    }

    @GetMapping("/{id}")
    public Mono<AccountType> findById(@PathVariable("id") String id){
        return accountTypeService.findById(id);
    }


}
