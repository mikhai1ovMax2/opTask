package com.max.opTask.repositories;

import com.max.opTask.models.Book;

import java.util.List;

public interface GenericRepository<T, Integer> {
    T save(T object);
    T update(T object);
    T getById(Integer id);
    List<Book> getAll();
    void deleteById(Integer id);
}
