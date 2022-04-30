package ru.hirakurai.todomanager.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.hirakurai.todomanager.model.entities.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {
    Boolean deleteTaskById(Long id);
}
