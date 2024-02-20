package com.s2p.todoservice;

import com.s2p.dao.iTaskDAO;
import com.s2p.models.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class Todoserviceimp implements Todoservice{

    @Autowired
    iTaskDAO taskDAO;
    @Override
    public List<Task> getAllTasks() {
        return taskDAO.findAll();
    }

    @Override
    public Task addTask(Task t) {
        return taskDAO.save(t);
    }

    @Override
    public Task updateTask(Task t) {
        return taskDAO.save(t);
    }

    @Override
    public Task deleteTask(Task t) {
        return null;
    }
}
