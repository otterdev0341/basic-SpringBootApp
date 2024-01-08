package dev.java.springboot.spring5webApp.controllers;

import dev.java.springboot.spring5webApp.respositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthor(Model model){
        model.addAttribute("authors",authorRepository.findAll());
        // return will look at resources/templates/[A]/[B]
        // A = directory inside template , B = html file that want to render
        return "authors/list";
    }
}
