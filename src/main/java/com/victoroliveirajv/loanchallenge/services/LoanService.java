package com.victoroliveirajv.loanchallenge.services;

import com.victoroliveirajv.loanchallenge.model.dtos.ClientDTO;
import com.victoroliveirajv.loanchallenge.model.dtos.LoanDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoanService {

    public List<LoanDTO> determineLoans(ClientDTO client){

        List<LoanDTO> listLoans = new ArrayList<>();

        if (client.income() <= 3000.0){

            listLoans.add(new LoanDTO("PERSONAL", 4));
            listLoans.add(new LoanDTO("GUARANTEED",3));
        }

        if (client.income() >= 3000.0 && client.income() <= 5000.0 && client.age() < 30 && "SP".equalsIgnoreCase(client.location())){
            listLoans.add(new LoanDTO("PERSONAL", 4));
            listLoans.add(new LoanDTO("GUARANTEED",3));

        }

        if (client.income() >= 5000.0){
            listLoans.add(new LoanDTO("CONSIGNMENT", 2));
        }

        return listLoans;
    }
}
