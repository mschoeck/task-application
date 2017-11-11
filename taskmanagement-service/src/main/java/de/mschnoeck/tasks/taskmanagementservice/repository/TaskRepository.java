package de.mschnoeck.tasks.taskmanagementservice.repository;

import de.mschnoeck.tasks.taskmanagementservice.model.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;


@RestResource
public interface TaskRepository extends CrudRepository<Task, Long> {
}
