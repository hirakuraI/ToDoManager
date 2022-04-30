package ru.hirakurai.todomanager.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.hirakurai.todomanager.model.entities.Task;
import ru.hirakurai.todomanager.model.repositories.TaskRepository;

@RestController
@RequestMapping("/task")
public class TaskController {

    //TODO ЗАменить на сервис и протетсить через постман
    private final TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


    @PostMapping
    public Task postTask(@RequestBody Task task) {
        return taskRepository.save(task);
    }
}
