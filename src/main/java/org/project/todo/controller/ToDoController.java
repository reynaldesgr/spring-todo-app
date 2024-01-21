package org.project.todo.controller;

import org.project.todo.model.ToDo;
import org.project.todo.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ToDoController
{
    @Autowired
    private ToDoService toDoService;

    @GetMapping("/")
    public String listToDo(Model model)
    {
        model.addAttribute("todos", toDoService.getAll());
        return "index"; // Nom du fichier HTML pour le template
    }

    @PostMapping("/add")
    public String addToDo(ToDo todo)
    {
        toDoService.save(todo);
        return "redirect:/";
    }
}
