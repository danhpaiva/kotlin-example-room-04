package com.example.todoapp

import java.time.Instant
import java.util.Date

data class Todo(
    var id: Int,
    var titulo: String,
    var criadoEm: Date
)

fun getMockTodo(): List<Todo> {
    return listOf<Todo>(
        Todo(1, "Primero Item", Date.from(Instant.now())),
        Todo(2, "Segundo Item", Date.from(Instant.now())),
        Todo(3, "Terceiro Item", Date.from(Instant.now())),
        Todo(4, "Quarto Item", Date.from(Instant.now()))
    )
}