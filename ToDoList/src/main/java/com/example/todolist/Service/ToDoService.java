package com.example.todolist.Service;

import com.example.todolist.Model.ToDoModel;
import com.example.todolist.Repository.ToDoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {
    private final ToDoRepository repo;

    public ToDoService(ToDoRepository repo) {
        this.repo = repo;
    }

    public List<ToDoModel> getAll() {
        return repo.findAll();
    }

    public ToDoModel create(ToDoModel todo) {
        return repo.save(todo);
    }

    public void delete(String id) {
        repo.deleteById(id);
    }
}
