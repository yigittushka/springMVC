package com.course.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;


@Controller
public class MyController {

    @RequestMapping("/")
    public String showFirstView(){
        return "first-view";
    }

    @RequestMapping("askName")
    public String askNamePeople(Model model){

        model.addAttribute("employee", new Employee());

        return  "ask-name-People";
    }


    @RequestMapping("showName")
    public String showNamePeople(@Valid @ModelAttribute("employee")  Employee emp, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return  "ask-name-People";

        }else{

            return  "show-name-People";
        }


    }
}
