package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shrey
 */
public class Address {
    private String GPSLocation;
    private String city;
    private String state;
    private String country;

    
    public String getGPSLocation() {
        return GPSLocation;
    }

    // Getter and setter methods for latitude
    public void setGPSLocation(String GPSLocation) {    
        this.GPSLocation = GPSLocation;
    }

    // Getter and setter methods for city
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // Getter and setter methods for state
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // Getter and setter methods for country
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "GPSLocation =" + GPSLocation +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

