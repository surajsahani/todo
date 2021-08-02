package com.example.todo_app.viewModels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.todo_app.db.TodoTask;
import com.example.todo_app.repositories.TodoRepository;

import java.util.List;

public class TodoTaskViewModel extends AndroidViewModel {
    public TodoRepository mRepository;
    private LiveData<List<TodoTask>> mallTasks;

    public TodoTaskViewModel(@NonNull Application application) {
        super(application);
        mRepository = new TodoRepository(application);
        mallTasks = mRepository.getAllTasks();
    }
    public LiveData<List<TodoTask>> getAllTasks() {
        return mallTasks;
    }

    public void insert(TodoTask todoTask) {
        mRepository.insert(todoTask);
    }
    public void delete(TodoTask todoTask) { mRepository.delete(todoTask);}
    public void update(TodoTask todoTask) { mRepository.update(todoTask);}

}
