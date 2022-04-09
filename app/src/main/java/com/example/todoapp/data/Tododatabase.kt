package com.example.todoapp.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Todo::class],version = 1)
abstract class Tododatabase: RoomDatabase() {

    abstract val dao: TodoDao

}

// for room to define and tell entities and dao and version