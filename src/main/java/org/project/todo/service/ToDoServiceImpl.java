package org.project.todo.service;

import org.project.todo.model.ToDo;
import org.project.todo.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoServiceImpl implements ToDoService
{
    @Autowired
    private ToDoRepository toDoRepository;

    @Override
    public List<ToDo> getAll() {
        return toDoRepository.findAll();
    }

    @Override
    public ToDo save(ToDo todo) {
        return toDoRepository.save(todo);
    }

    @Override
    public ToDo getById(Long id) {
        return toDoRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        toDoRepository.deleteById(id);
    }
}
