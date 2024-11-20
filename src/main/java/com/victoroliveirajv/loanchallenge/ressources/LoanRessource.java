package com.victoroliveirajv.loanchallenge.ressources;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping(value = "/customer-loans")
public class LoanRessource {

    @PostMapping
    private Map<String, Object> getAvaliableLoan(@RequestBody Map<String, Object> request){

        int age = (int) request.get("age");
        double salary = (double) request.get("income");
        String location = String.valueOf(request.get("location"));

        List<Map<String, Object>> loans = new ArrayList<>();

        if (salary <= 3000.0){
            loans.add(createLoans("PERSONAL", 4));
            loans.add(createLoans("GUARANTEED", 3));
        }

        if (salary >= 3000.0 && salary <= 5000.0 && age < 30 && "SP".equalsIgnoreCase(location)){
            loans.add(createLoans("PERSONAL", 4));
            loans.add(createLoans("GUARANTEED", 3));

        }

        if (salary >= 5000.0){
            loans.add(createLoans("CONSIGNMENT", 2));
        }

        Map<String, Object> reponse = new TreeMap<>();
        reponse.put("customer", request.get("name"));
        reponse.put("loans", loans);

        return reponse;
    }

    private Map<String, Object> createLoans(String type, int interesRate){
        Map<String, Object> loan = new TreeMap<>();
        loan.put("type", type);
        loan.put("interest_rate",interesRate);

        return loan;
    }
}
