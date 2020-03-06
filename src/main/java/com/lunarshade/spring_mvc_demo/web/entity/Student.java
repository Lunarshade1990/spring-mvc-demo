package com.lunarshade.spring_mvc_demo.web.entity;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String favouriteLanguage;
    private Map<String, String> countries;
    private Map<String, String> languages;
    private Map<String, String> systemList;
    private ArrayList<String> operatingSystems;

    public Student() {
        countries = new LinkedHashMap<>();
        countries.put("RU", "Russia");
        countries.put("BR", "Belarus");
        countries.put("UK", "Ukraine");

        // populate favorite language options
        languages = new LinkedHashMap<>();
        languages.put("Java", "Java");
        languages.put("C#", "C#");
        languages.put("PHP", "PHP");
        languages.put("Ruby", "Ruby");

        systemList = new LinkedHashMap<>();
        systemList.put("Windows", "Windows");
        systemList.put("Mac OS", "Mac OS");
        systemList.put("Linux", "Linux");
    }

    public Map<String, String> getSystemList() {
        return systemList;
    }

    public ArrayList<String> getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(ArrayList<String> operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    public String getFavouriteLanguage() {
        return favouriteLanguage;
    }

    public void setFavouriteLanguage(String favouriteLanguage) {
        this.favouriteLanguage = favouriteLanguage;
    }

    public Map<String, String> getLanguages() {
        return languages;
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
