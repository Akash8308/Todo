package com.mytaskmanager.taskmanager.controller;

import com.mytaskmanager.taskmanager.model.Todo;
import com.mytaskmanager.taskmanager.repository.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private final TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping
    public List<Todo> getTodos(){
        return todoRepository.findAll();
    }

    @PostMapping
    public Todo addTodo(@RequestBody Todo todo){
        return todoRepository.save(todo);
    }

    @DeleteMapping("/{Id}")
    public void deleteTodo(@PathVariable long Id){
        todoRepository.deleteById(Id);
    }

}
