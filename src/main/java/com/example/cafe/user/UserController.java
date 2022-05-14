package com.example.cafe.user;

import com.example.cafe.cafe.Cafe;
import com.example.cafe.cafe.CafeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private final CafeService cafeService;


    @GetMapping("/login")
    public String getLoginPage(){
        return "login";
    }

    @GetMapping("/register")
    public String registerUser(Model model, @RequestParam(value = "userName") String name,
                               @RequestParam(value = "password") String password){
        userService.saveUser(name, password);

        List<Cafe> cafes = cafeService.getAllCafes();
        model.addAttribute("cafes", cafes);
        model.addAttribute("userName", name);

        return "list-cafe";
    }

    @GetMapping("/registerPage")
    public String giveRegisterPage(){
        return "register";
    }

}
