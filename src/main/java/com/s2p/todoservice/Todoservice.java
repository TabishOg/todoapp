package com.s2p.todoservice;

import com.s2p.models.Task;

import java.util.List;

public interface Todoservice {
    public List <Task> getAllTasks();
    public Task addTask (Task t);
    public Task updateTask (Task t);
    public Task deleteTask(Task t);
}
