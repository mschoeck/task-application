package de.mschnoeck.tasks.taskmanagement;

import de.mschnoeck.tasks.taskmanagement.model.Task;
import de.mschnoeck.tasks.taskmanagement.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class TaskManagementApplication {


	@Component
	public class TaskDataLoader implements ApplicationRunner {

		@Autowired
		private TaskRepository repository;

		@Override
		public void run(ApplicationArguments args) throws Exception {
			Task t1 = new Task("Milch holen", "Beim Bauer noch Milch holen");
			repository.save(t1);
			Task t2 = new Task("Auto waschen", "Mit dem Auto in die Waschanlage fahren");
			repository.save(t2);
			Task t3 = new Task("Paket von der Post holen", "Das Zalando-Paket von der Postfiliale holen");
			repository.save(t3);

		}
	}


	public static void main(String[] args) {
		SpringApplication.run(TaskManagementApplication.class, args);
	}
}
