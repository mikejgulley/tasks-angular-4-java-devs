package com.lumatik.tasks.controller;

import com.lumatik.tasks.domain.Task;
import com.lumatik.tasks.service.TaskService;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Michael J. Gulley (mikejgulley) on 9/25/2017.
 */
@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping( value = {"", "/"} )
    public Iterable<Task> list() {
        return this.taskService.list();
    }

    @PostMapping("/save")
    public Task saveTask(@RequestBody Task task) {
        return this.taskService.save(task);
    }

}
