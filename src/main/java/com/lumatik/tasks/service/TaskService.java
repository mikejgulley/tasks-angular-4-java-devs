package com.lumatik.tasks.service;

import com.lumatik.tasks.domain.Task;

/**
 * Created by Michael J. Gulley (mikejgulley) on 9/25/2017.
 */
public interface TaskService {

    Iterable<Task> list();

    Task save(Task task);

}
