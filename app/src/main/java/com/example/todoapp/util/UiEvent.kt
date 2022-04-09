package com.example.todoapp.util

sealed class UiEvent {
    object PopBackstack : UiEvent()
    data class Navigate(val route: String): UiEvent()
    data class ShowSnackbar(
        val message: String,
        val action: String? = null
    ): UiEvent()
}

//event that we have to do on response to events send by
// the user through ui fragment and we will do it through
// the help of viewmodel


//send events from the viemodel to ui