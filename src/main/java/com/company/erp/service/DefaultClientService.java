package com.company.erp.service;

import com.company.erp.data.Client;
import com.company.erp.dto.ClientData;
import com.company.erp.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("clientService")
public class DefaultClientService implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public ClientData saveClient(ClientData client) {
        Client clientModel = populateClientEntity(client);
        return populateClientData(clientRepository.save(clientModel));
    }

    private Client populateClientEntity(ClientData clientData) {
        Client client = new Client();
        client.setClientName(clientData.getClientName());
        client.setPersonName(clientData.getPersonName());
        client.setPersonEmail(clientData.getPersonEmail());
        client.setPersonMobileNo(clientData.getPersonMobileNo());
        client.setCommercialRegNo(clientData.getCommercialRegNo());
        client.setCommercialReg(clientData.getCommercialReg());
        client.setHousing(clientData.getHousing());
        client.setTransportation(clientData.getTransportation());
        client.setCostType(clientData.getCostType());
        client.setProfession(clientData.getProfession());
        client.setNationality(clientData.getNationality());
        client.setTaskApproval(clientData.getTaskApproval());
        return client;
    }

    private ClientData populateClientData(final Client client) {
        ClientData clientData = new ClientData();
        clientData.setClientName(client.getClientName());
        clientData.setPersonName(client.getPersonName());
        clientData.setPersonEmail(client.getPersonEmail());
        clientData.setPersonMobileNo(client.getPersonMobileNo());
        clientData.setCommercialRegNo(client.getCommercialRegNo());
        clientData.setCommercialReg(client.getCommercialReg());
        clientData.setHousing(client.getHousing());
        clientData.setTransportation(client.getTransportation());
        clientData.setCostType(client.getCostType());
        clientData.setProfession(client.getProfession());
        clientData.setNationality(client.getNationality());
        clientData.setTaskApproval(client.getTaskApproval());
        return clientData;
    }

}
