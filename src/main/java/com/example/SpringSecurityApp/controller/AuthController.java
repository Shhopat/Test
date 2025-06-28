package com.example.SpringSecurityApp.controller;

import com.example.SpringSecurityApp.model.Person;
import com.example.SpringSecurityApp.services.RegistrationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/auth")
public class AuthController {

    private final RegistrationService registrationService;


    @Autowired
    public AuthController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @GetMapping("/login")
    public String getAuth() {
        System.out.println("вызван контроллер логина");
        return "login";
    }

    @GetMapping("/registration")
    public String getFormRegistration(@ModelAttribute("person") Person person) {
        return "registration";
    }

    @PostMapping()
    public String registration(@ModelAttribute("person") @Valid Person person,
                               BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "registration";
        }
        registrationService.register(person);
        //тут мы вызвали метод из нового сервиза
        return "redirect:/hello";


    }


}
