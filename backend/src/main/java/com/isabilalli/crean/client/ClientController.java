package com.isabilalli.crean.client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.isabilalli.crean.client.dto.CreateClientRequest;
import com.isabilalli.crean.client.dto.ClientResponse;

import jakarta.validation.Valid;


@RestController 
@RequestMapping("/api/clients") 
public class ClientController {
    private final ClientService ClientService;

    public ClientController(ClientService ClientService){
        this.ClientService = ClientService;
    }

    @GetMapping
    public List<ClientResponse> getAllClients() {
        return ClientService.getAllClients();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<ClientResponse> getClientById(@PathVariable  Long id) {
        return ClientService.getClientById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
    
    @PostMapping
    public ResponseEntity<ClientResponse> createClient(@Valid @RequestBody CreateClientRequest request) {
        return ResponseEntity.ok(ClientService.createClient(request));
    }  
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClient(@PathVariable Long id){
        ClientService.deleteClient(id);
        return ResponseEntity.noContent().build();
    } 

}
