package com.thecodeinnovator.genericservice.specific.controller;

import com.thecodeinnovator.genericservice.specific.model.Admin;
import com.thecodeinnovator.genericservice.specific.service.AdminServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {
 
    @Autowired(required = true)
    private AdminServiceImpl adminService;
    
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String viewLogin(Model model) {
        model.addAttribute("admin", new Admin());
        return "/index";
    }

    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public String login(@ModelAttribute("admin") Admin admin, Model model) {
        if (admin.getUsername() != null) {
            Admin registeredAdmin = adminService.getAdmin(admin.getUsername());
            if(registeredAdmin!=null){
                model.addAttribute("message", "Welcome "+admin.getUsername());
                model.addAttribute("messageType","information");
            }else{
                model.addAttribute("message", "User not found");
                model.addAttribute("messageType","warning");
            }
        } else {
            model.addAttribute("message", "User not found");
            model.addAttribute("messageType","warning");
        }
        return "/index";
    }
}