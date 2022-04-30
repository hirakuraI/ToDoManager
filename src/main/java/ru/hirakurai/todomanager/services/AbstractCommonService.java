package ru.hirakurai.todomanager.services;

import org.springframework.data.repository.CrudRepository;
import ru.hirakurai.todomanager.model.entities.EntityInterface;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractCommonService<T extends EntityInterface, R extends CrudRepository<T, Long>> implements CommonService<T> {

    private final R repository;

    protected AbstractCommonService(R repository) {
        this.repository = repository;
    }

    @Override
    public T getById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<T> getAll() {
        Iterable<T> all = repository.findAll();
        ArrayList<T> ts = new ArrayList<>();
        all.forEach(ts::add);
        return ts;
    }

    @Override
    public T insert(T entity) {
        if (entity.getId() != null) {
            throw new RuntimeException("Entity id must be null!");
        }
        return repository.save(entity);
    }

    @Override
    public T update(T entity) {
        if (entity.getId() == null) throw new RuntimeException("Id not must be null!");
        return repository.save(entity);
    }

    @Override
    public Boolean deleteById(Long id) {
        //TODO Создать общий репо интерфейс, заэксендить его крудом, задекларировать deleById с возвращаемым значением Boolean
        return null;
    }
}
