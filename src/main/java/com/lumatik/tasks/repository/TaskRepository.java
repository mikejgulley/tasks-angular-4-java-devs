package com.lumatik.tasks.repository;

import com.lumatik.tasks.domain.Task;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Michael J. Gulley (mikejgulley) on 9/25/2017.
 */
public interface TaskRepository extends CrudRepository<Task, Long> {



}
