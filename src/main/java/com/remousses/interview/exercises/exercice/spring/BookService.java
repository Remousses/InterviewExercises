package com.remousses.interview.exercises.exercice.spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class BookService {
    private BookRepository bookRepository;

    @Autowired
    public final void init(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    @Transactional
    public Book save(Book book) {
        return bookRepository.save(book);
    }
    @Transactional
    public Book read(Integer id) {
        return bookRepository.findById(id).orElse(null);
    }
    @Transactional
    public String getContentActionById(Integer id) {
        final Book book = read(id);
        String content = null;
        if (book.getTarget().equals("Adult")) {
            content = "Specific content";
        } else if (book.getTarget().equals("Child")) {
            content = "Cartoon";
        }

        return content;
    }
}
