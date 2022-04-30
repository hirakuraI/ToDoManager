package ru.hirakurai.todomanager.services.implement;

import org.springframework.stereotype.Service;
import ru.hirakurai.todomanager.model.entities.Task;
import ru.hirakurai.todomanager.model.repositories.TaskRepository;
import ru.hirakurai.todomanager.services.AbstractCommonService;

@Service
public class TaskServiceImpl extends AbstractCommonService<Task, TaskRepository> {

    private final TaskRepository taskRepository;

    protected TaskServiceImpl(TaskRepository taskRepository) {
        super(taskRepository);
        this.taskRepository = taskRepository;
    }
}
