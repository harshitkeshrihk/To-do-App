package com.example.todoapp.di

import android.app.Application
import androidx.room.Room
import com.example.todoapp.data.TodoRepository
import com.example.todoapp.data.TodoRepositoryImpl
import com.example.todoapp.data.Tododatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideTodoDatabase(app: Application): Tododatabase{
        return Room.databaseBuilder(
            app,
            Tododatabase::class.java,
            "todo_db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideTodoRepository(db: Tododatabase):TodoRepository{
        return TodoRepositoryImpl(db.dao)
    }
}

//here we provide all of the dependencies
// and objects we want to be able to inject somewhere in our code