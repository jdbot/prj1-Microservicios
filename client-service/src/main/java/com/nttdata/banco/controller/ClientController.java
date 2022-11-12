package com.nttdata.banco.controller;

import com.nttdata.banco.model.Client;
import com.nttdata.banco.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private IClientService clientService;

    @GetMapping
    public Flux<Client> findAll(){
        return clientService.findAll();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
                 produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Client> register(@RequestBody Client client){
        return  clientService.register(client);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Client> modify(@RequestBody Client client){
        return  clientService.update(client);
    }

    @GetMapping("/{id}")
    public Mono<Client> findById(@PathVariable("id") String id){
        return clientService.findById(id);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable("id") String id){
        return clientService.delete(id);
    }
}
