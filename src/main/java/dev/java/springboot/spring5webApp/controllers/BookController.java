package dev.java.springboot.spring5webApp.controllers;

import dev.java.springboot.spring5webApp.respositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBook(Model model){

        model.addAttribute("books",bookRepository.findAll());

        // return will look at resources/templates/[A]/[B]
        // A = directory inside template , B = html file that want to render
        return "books/list";
    }
}
