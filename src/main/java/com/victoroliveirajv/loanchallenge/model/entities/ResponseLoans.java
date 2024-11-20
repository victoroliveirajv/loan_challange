package com.victoroliveirajv.loanchallenge.model.entities;

import com.victoroliveirajv.loanchallenge.model.dtos.LoanDTO;

import java.util.List;

public class ResponseLoans {

    private String customer;
    private List<LoanDTO> loans;

    public ResponseLoans() {
    }

    public ResponseLoans(String customer, List<LoanDTO> loans) {
        this.customer = customer;
        this.loans = loans;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public List<LoanDTO> getLoans() {
        return loans;
    }

    public void setLoans(List<LoanDTO> loans) {
        this.loans = loans;
    }
}
