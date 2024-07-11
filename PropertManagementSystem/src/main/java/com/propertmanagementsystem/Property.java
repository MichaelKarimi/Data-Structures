/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.propertmanagementsystem;

/**
 *
 * @author user
 */
public class Property {
    private String id;
    private String address;
    private double rent;

    public Property(String id, String address, double rent) {
        this.id = id;
        this.address = address;
        this.rent = rent;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public double getRent() {
        return rent;
    }

    @Override
    public String toString() {
        return "Property ID: " + id + ", Address: " + address + ", Rent: " + rent;
    }
}

    
