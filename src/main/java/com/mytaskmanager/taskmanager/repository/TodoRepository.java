package com.mytaskmanager.taskmanager.repository;

import com.mytaskmanager.taskmanager.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    Todo save(Todo todo);
}
