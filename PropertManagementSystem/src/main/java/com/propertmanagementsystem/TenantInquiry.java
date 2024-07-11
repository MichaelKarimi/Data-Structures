/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.propertmanagementsystem;

/**
 *
 * @author user
 */
public class TenantInquiry {
        private String tenantName;
    private String inquiry;

    public TenantInquiry(String tenantName, String inquiry) {
        this.tenantName = tenantName;
        this.inquiry = inquiry;
    }

    public String getTenantName() {
        return tenantName;
    }

    public String getInquiry() {
        return inquiry;
    }

    @Override
    public String toString() {
        return "Tenant: " + tenantName + ", Inquiry: " + inquiry;
    }
}

