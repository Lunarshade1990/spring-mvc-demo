package com.lunarshade.spring_mvc_demo.web.entity;

import com.lunarshade.spring_mvc_demo.web.annotation.CourseCode;

import javax.validation.constraints.*;

public class Customer {

    private String firstName;
    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private  String lastName;

    @NotNull(message = "is required")
    @Min(value = 0, message = "Must be greater or equal than 0")
    @Max(value = 10, message = "Must be less or equal than 10")
    private Integer freePasses;

    @Pattern(regexp = "^\\d{3} *\\d{3}", message = "Postal code must contain 6 digits with or without whitespace")
    private String postalCode;

    private String courseCode;

    public Customer() {
    }

    @CourseCode(value = {"LUV", "TOP"}, message = "must starts with LUV or TOP")
    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
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
