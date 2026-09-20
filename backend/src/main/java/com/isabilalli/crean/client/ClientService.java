package com.isabilalli.crean.client;

import org.springframework.stereotype.Service;
import com.isabilalli.crean.client.dto.*;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService{
    private final ClientRepository ClientRepository;

    public ClientService(ClientRepository ClientRepository){
        this.ClientRepository=ClientRepository;
    }

    private ClientResponse toResponse(Client client){
        return new ClientResponse(client.getId(), client.getName(), client.getPhoneNumber(), client.getEmail());
    }

    public List<ClientResponse> getAllClients(){
        return ClientRepository.findAll().stream().map(this::toResponse).toList();
    }

    public Optional<ClientResponse> getClientById(Long id){
        return ClientRepository.findById(id).map(this::toResponse);
    }

    public ClientResponse createClient(CreateClientRequest request){
        Client client = new Client(
            request.getName(),
            request.getPhoneNumber(),
            request.getEmail()
        );
        
        Client savedClient = ClientRepository.save(client);
        return toResponse(savedClient);
    }

    public void deleteClient(Long id){
        ClientRepository.deleteById(id);
    }
}