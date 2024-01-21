package org.project.todo.repository;

import org.project.todo.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ToDoRepository extends JpaRepository<ToDo, Long>
{ }
