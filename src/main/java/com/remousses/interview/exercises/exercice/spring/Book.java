package com.remousses.interview.exercises.exercice.spring;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(schema = "Book")
@Entity
@Getter
@Setter
public class Book {
    private Integer id;
    private String title;
    private String content;
    private String target;
}
