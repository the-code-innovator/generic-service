package com.thecodeinnovator.genericservice.specific.service;

import com.thecodeinnovator.genericservice.generic.service.GenericService;
import com.thecodeinnovator.genericservice.specific.model.Book;
import com.thecodeinnovator.genericservice.specific.repository.BookRepository;

import org.springframework.stereotype.Service;

@Service
public class BookService extends GenericService<Book> {
    public BookService(BookRepository repository) {
        super(repository);
    }
}
