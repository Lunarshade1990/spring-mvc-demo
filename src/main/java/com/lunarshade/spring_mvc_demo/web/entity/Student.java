package com.lunarshade.spring_mvc_demo.web.entity;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private Map<String, String> countries;

    public Student() {
        countries = new HashMap<>();
        countries.put("RU", "Russia");
        countries.put("BR", "Belarus");
        countries.put("UK", "Ukraine");
    }

    public Map<String, String> getCountries() {
        return countries;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
