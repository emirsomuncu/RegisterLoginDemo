package com.example.registrationLoginDemo.controllers;

import com.example.registrationLoginDemo.entities.User;
import com.example.registrationLoginDemo.service.abstracts.UserService;
import com.example.registrationLoginDemo.service.request.LoginPageRequest;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private UserService userService ;

    @GetMapping("/home")
    public String homePage() {
        return "home" ;
    }

    @RequestMapping("/registrationPage")
    public String registrationPage(Model model) {

        User user = new User() ;
        model.addAttribute("user" , user);

        return "registrationPage";
    }

    @PostMapping("/save")
    public String saveUser(@Valid @ModelAttribute("user") User user , BindingResult bindingResult ) {

        if(bindingResult.hasErrors()) {
            return "registrationPage";
        }

        userService.saveUser(user);
        return "redirect:/user/home";
    }

    @RequestMapping("/loginPage")
    public String loginPage(Model model) {

        LoginPageRequest pageRequest = new LoginPageRequest();
        model.addAttribute("pageRequest" , pageRequest) ;

        return "loginPage";
    }

    @PostMapping("/authentication")
    public String authentication(@Valid @ModelAttribute("pageRequest") LoginPageRequest loginPageRequest , BindingResult bindingResult ) {

        if(bindingResult.hasErrors()) {
            return "loginPage";
        }

        String password = loginPageRequest.getPassword();
        userService.checkUser(password);

        return "mainPage";

    }

    @ExceptionHandler
    public String handleRuntimeException(RuntimeException runtimeException) {
        return "errorPage";
    }

}
