package com.example.todolist.Repository;

import com.example.todolist.Model.ToDoModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface  ToDoRepository extends MongoRepository<ToDoModel,String> {
}
