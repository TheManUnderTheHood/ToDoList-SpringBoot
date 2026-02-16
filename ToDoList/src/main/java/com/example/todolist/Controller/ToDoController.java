package com.example.todolist.Controller;


import com.example.todolist.Model.ToDoModel;
import com.example.todolist.Service.ToDoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
@CrossOrigin
public class ToDoController {

    private final ToDoService service;

    public ToDoController(ToDoService service) {
        this.service = service;
    }

    @GetMapping
    public List<ToDoModel> getAll() {
        return service.getAll();
    }

    @PostMapping
    public ToDoModel create(@RequestBody ToDoModel todo) {
        return service.create(todo);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}