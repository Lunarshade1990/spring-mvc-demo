package com.lunarshade.spring_mvc_demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String nameToUpperCase(HttpServletRequest request, Model model) {

        String studentName = request.getParameter("studentName");
        studentName = studentName.toUpperCase();
        String message = "Yo! " + studentName;
        model.addAttribute("message", message);
        return "helloworld";
    }

    @RequestMapping("/processFormVersionThree")
    public String nameToUpperCase(@RequestParam("studentName") String studentName, Model model) {

        studentName = studentName.toUpperCase();
        String message = "These is v3! " + studentName;
        model.addAttribute("message", message);
        return "helloworld";
    }


}
