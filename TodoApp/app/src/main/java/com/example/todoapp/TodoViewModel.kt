package com.example.todoapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TodoViewModel : ViewModel() {
    private var _todoList = MutableLiveData<List<Todo>>()
    val todoList : LiveData<List<Todo>> = _todoList

    fun getAllTodo(){
        _todoList.value = TodoGerenciador.getAllTodo().reversed()
    }

    fun addTodo(titulo : String){
        TodoGerenciador.addTodo(titulo)
        getAllTodo()
    }

    fun deleteTodo(id : Int){
        TodoGerenciador.deleteTodo(id)
        getAllTodo()
    }
}