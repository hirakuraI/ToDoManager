package ru.hirakurai.todomanager.services;

import ru.hirakurai.todomanager.model.entities.Task;

import java.util.List;

public interface CommonService<T>{
    T getById(Long id);

    List<T> getAll();

    T insert(T entity);

    T update(T entity);

    Boolean deleteById(Long id);
}
