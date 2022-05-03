package com.thecodeinnovator.genericservice.specific.controller;

import com.thecodeinnovator.genericservice.generic.controller.GenericController;
import com.thecodeinnovator.genericservice.specific.model.Book;
import com.thecodeinnovator.genericservice.specific.repository.BookRepository;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/book/")
public class BookController extends GenericController<Book> {
    public BookController(BookRepository repository) {
        super(repository);
    }
}
