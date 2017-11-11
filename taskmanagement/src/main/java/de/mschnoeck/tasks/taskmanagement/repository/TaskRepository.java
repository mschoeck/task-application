package de.mschnoeck.tasks.taskmanagement.repository;

import de.mschnoeck.tasks.taskmanagement.model.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;


@RestResource
public interface TaskRepository extends CrudRepository<Task, Long> {
}
