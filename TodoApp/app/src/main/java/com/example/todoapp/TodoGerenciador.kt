package com.example.todoapp

import java.time.Instant
import java.util.Date

object TodoGerenciador {

    private val todoList = mutableListOf<Todo>()

    fun getAllTodo(): List<Todo> {
        return todoList
    }

    fun addTodo(titulo: String) {
        todoList.add(Todo(System.currentTimeMillis().toInt(), titulo, Date.from(Instant.now())))
    }

    fun deleteTodo(id: Int) {
        todoList.removeIf { it.id == id }
    }
}