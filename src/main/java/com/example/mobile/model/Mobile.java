package com.example.mobile.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mobile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int serial;
    private String model;

    public Mobile(){
    }

    public Mobile(String model, int serial){
        this.model =model;
        this.serial = serial;
    }

    public Mobile(String model) {
        this.model = model;
    }

    public int getSerialNumber() {
        return serial;
    }

    public void setSerialNumber(int serial) {
        this.serial = serial;
    }

    public String getModelName() {
        return model;
    }

    public void setModelName(String model) {
        this.model = model;
    }
}
