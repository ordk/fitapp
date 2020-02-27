package com.ordk.fitapp.controller;

import com.ordk.fitapp.model.Person;
import com.ordk.fitapp.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getIndex() {
        return "index";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getUserIndex(Model model) {
        model.addAttribute("persons", this.personService.findAll());
        return "user/index";
    }

}
