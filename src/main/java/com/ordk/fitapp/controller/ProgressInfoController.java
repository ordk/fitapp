package com.ordk.fitapp.controller;

import com.ordk.fitapp.service.PersonService;
import com.ordk.fitapp.service.ProgressInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/progress-info")
@Controller
public class ProgressInfoController {

    @Autowired
    private ProgressInfoService progressInfoService;

    @Autowired
    private PersonService personService;

    @RequestMapping("/get-all-entries")
    public String getAllEntries(Model model) {
        model.addAttribute("entries", progressInfoService.findAll());
        return "progressinfo/index";
    }

    @GetMapping("/get-all-entries/{id}")
    public String getFooById(@PathVariable int id, Model model) {
        Long tmpId = Long.valueOf(id);
        model.addAttribute("entries", progressInfoService.findAllByPerson_Id(tmpId));
        return "progressinfo/index";
    }
}
