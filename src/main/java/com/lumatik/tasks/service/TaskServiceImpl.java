package com.lumatik.tasks.service;

import com.lumatik.tasks.domain.Task;
import com.lumatik.tasks.repository.TaskRepository;
import org.springframework.stereotype.Service;

/**
 * Created by Michael J. Gulley (mikejgulley) on 9/25/2017.
 */
@Service
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> list() {
        return this.taskRepository.findAll();
    }

    @Override
    public Task save(Task task) {
        return this.taskRepository.save(task);
    }
}
