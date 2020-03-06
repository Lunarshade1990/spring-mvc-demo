package com.lunarshade.spring_mvc_demo.web.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.util.Arrays;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

    private String[] coursePrefix;

    @Override
    public void initialize(CourseCode constraintAnnotation) {
        coursePrefix = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value!=null) {
           return Arrays.stream(coursePrefix)
                   .anyMatch(coursePrefix -> value.startsWith(coursePrefix));
        } else return true;
    }
}
