package org.project.todo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class ToDo
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String titre;

    private String description;

    private boolean done;

    public ToDo() {}

    public ToDo(String titre, String description, boolean done)
    {
        this.titre = titre;
        this.description = description;
        this.done = done;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }


}
