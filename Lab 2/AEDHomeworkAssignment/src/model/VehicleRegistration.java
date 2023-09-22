/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author shrey
 */
public class VehicleRegistration {
    private String registrationNumber;
    private String serialnNumber;
    private String modelName; 
    private String manufacturingYear; 
    private String ownerName;
    
    
    public String getSerialnNumber() {
        return serialnNumber;
    }

    // Getter and Setter for registrationNumber
    public void setSerialnNumber(String serialnNumber) {
        this.serialnNumber = serialnNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    // Getter and Setter for modelName
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    // Getter and Setter for manufacturingYear
    public String getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(String manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    // Getter and Setter for ownerName
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "VehicleRegistration{" +
                "registrationNumber='" + registrationNumber + '\'' +
                "serialNumber='" + serialnNumber + '\'' +
                ", modelName='" + modelName + '\'' +
                ", manufacturingYear='" + manufacturingYear + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}


