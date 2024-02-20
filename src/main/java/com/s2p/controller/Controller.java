package com.s2p.controller;


import com.s2p.models.Task;
import com.s2p.todoservice.Todoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    Todoservice taskService;

    @GetMapping ("get")
public List<Task> getAll(){
    return taskService.getAllTasks();
}
    @PostMapping("add")
public @ResponseBody Task addTask(@RequestBody Task t){
        return taskService.addTask(t);

}
}