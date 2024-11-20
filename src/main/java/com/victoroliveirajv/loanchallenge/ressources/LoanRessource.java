package com.victoroliveirajv.loanchallenge.ressources;

import com.victoroliveirajv.loanchallenge.model.dtos.ClientDTO;
import com.victoroliveirajv.loanchallenge.model.dtos.LoanDTO;
import com.victoroliveirajv.loanchallenge.model.entities.ResponseLoans;
import com.victoroliveirajv.loanchallenge.services.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping(value = "/customer-loans")
public class LoanRessource {

    @Autowired
    private LoanService service;

    @PostMapping
    private ResponseEntity<ResponseLoans> getAvaliableLoan(@RequestBody ClientDTO client){

        List<LoanDTO> loans = service.determineLoans(client);
        ResponseLoans response = new ResponseLoans(client.name(), loans);

        return ResponseEntity.ok(response);
    }
}
