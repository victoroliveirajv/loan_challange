package com.victoroliveirajv.loanchallenge.model.entities;

public class Loan {

    private String type;
    private Integer interesRate;

    public Loan() {
    }

    public Loan(String type, Integer interesRate) {
        this.type = type;
        this.interesRate = interesRate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getInteresRate() {
        return interesRate;
    }

    public void setInteresRate(Integer interesRate) {
        this.interesRate = interesRate;
    }

}
