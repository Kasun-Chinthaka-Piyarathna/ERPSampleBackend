package com.company.erp.controller;

import com.company.erp.constants.ApiConstants;
import com.company.erp.dto.ClientData;
import com.company.erp.dto.MessageResponse;
import com.company.erp.service.ClientService;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/clients")
public class ClientController {

    @Resource(name = "clientService")
    private ClientService clientService;


    /**
     * Post request to submit a client information in the system.
     *
     * @param clientData
     * @return
     */
    @PostMapping("/create")
    public ResponseEntity<?> saveClient(final @RequestBody ClientData clientData) {
        clientService.saveClient(clientData);
        return ResponseEntity.ok(new MessageResponse(ApiConstants.STATUS_SUCCESS,
                "Client Information has been submitted successfully!", null));
    }


}
