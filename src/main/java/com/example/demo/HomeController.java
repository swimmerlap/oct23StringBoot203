package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

public class HomeController {
    @GetMapping("/songform")
    public String loadFromPage(Model model){
        model.addAttribute("song", new Song());
        return "Songform";

    }



    @PostMapping("/songform")
    public String loadFromPage(@ModelAttribute Song song, Model model) {
        model.addAttribute("song", song);
        return "confirmsong";
    }
}
