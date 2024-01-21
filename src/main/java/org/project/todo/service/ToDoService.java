package org.project.todo.service;

import org.project.todo.model.ToDo;
import java.util.List;
public interface ToDoService {
    List<ToDo> getAll();
    ToDo save(ToDo todo);
    ToDo getById(Long id);
    void delete(Long id);
}
