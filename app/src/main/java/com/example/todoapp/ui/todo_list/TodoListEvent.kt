package com.example.todoapp.ui.todo_list

import com.example.todoapp.data.Todo

sealed class TodoListEvent{
    data class OnDeleteTodoClick(val todo: Todo): TodoListEvent()
    data class OnDoneChange(val todo: Todo,val isDone: Boolean): TodoListEvent()
    object OnUndoDeleteClick: TodoListEvent()
    data class OnTodoClick(val todo: Todo): TodoListEvent()
    object OnAddTodoClick: TodoListEvent()

}

// events send by the ui as the user interacts

//used to send events from the ui to our viewmodel