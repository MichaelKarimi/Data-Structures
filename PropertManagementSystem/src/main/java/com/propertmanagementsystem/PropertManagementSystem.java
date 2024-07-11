/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.propertmanagementsystem;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class PropertManagementSystem {
    private List<Property> properties = new ArrayList<>();
    private Queue<TenantInquiry> inquiries = new LinkedList<>();
    private stack<String> operationsHistory = new stack<>();
 public void addProperty(Property property) {
        properties.add(property);
        operationsHistory.push("Added property: " + property);
    }

    public void removeProperty(String propertyId) {
        properties.removeIf(property -> property.getId().equals(propertyId));
        operationsHistory.push("Removed property with ID: " + propertyId);
    }

    public void listProperties() {
        System.out.println("Listing all properties:");
        for (Property property : properties) {
            System.out.println(property);
        }
        operationsHistory.push("Listed all properties");
    }

    public void addInquiry(TenantInquiry inquiry) {
        inquiries.add(inquiry);
        operationsHistory.push("Added inquiry: " + inquiry);
    }

    public void processInquiry() {
        if (!inquiries.isEmpty()) {
            TenantInquiry inquiry = inquiries.poll();
            System.out.println("Processing inquiry: " + inquiry);
            operationsHistory.push("Processed inquiry: " + inquiry);
        } else {
            System.out.println("No inquiries to process.");
        }
    }

    public void showOperationsHistory() {
        System.out.println("Operations History:");
        while (!operationsHistory.isEmpty()) {
            System.out.println(operationsHistory.pop());
        }
    }

    public static void main(String[] args) {
        PropertyManagementSystem pms = new PropertyManagementSystem();

        // Add properties
        pms.addProperty(new Property("1", "123 Main St", 1200.00));
        pms.addProperty(new Property("2", "456 Elm St", 950.00));
        pms.addProperty(new Property("3", "789 Oak St", 1100.00));

        // List properties
        pms.listProperties();

        // Add tenant inquiries
        pms.addInquiry(new TenantInquiry("John Doe", "Interested in 123 Main St"));
        pms.addInquiry(new TenantInquiry("Jane Smith", "Interested in 456 Elm St"));

        // Process tenant inquiries
        pms.processInquiry();
        pms.processInquiry();
        pms.processInquiry();

        // Remove a property
        pms.removeProperty("2");

        // List properties again
        pms.listProperties();

        // Show operations history
        pms.showOperationsHistory();
    }
}