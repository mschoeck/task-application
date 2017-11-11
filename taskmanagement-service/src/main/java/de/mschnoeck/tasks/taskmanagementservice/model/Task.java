package de.mschnoeck.tasks.taskmanagementservice.model;


import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;


@Entity
@Data
@NoArgsConstructor
public class Task {

    public Task(String subject, String description){
        this.subject = subject;
        this.description = description;
        this.creationDate = LocalDateTime.now();
        this.completed = false;
    }

    @Id
    @Generated
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
    @SequenceGenerator(sequenceName = "customer_seq", allocationSize = 1, name = "CUST_SEQ")
    private long id;

    @NotNull
    @NotEmpty
    private String subject;

    private String description;

    @NotNull
    private LocalDateTime creationDate;

    private LocalDateTime completionDate;

    private boolean completed;
}
