package com.Kayles.todolist.repositories;

import com.Kayles.todolist.Model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoItemRepository extends JpaRepository<TodoItem, Long> {
}
