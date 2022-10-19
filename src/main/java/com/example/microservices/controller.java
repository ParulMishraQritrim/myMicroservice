package com.example.microservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping(value="todo/")
public class controller
{
    @Autowired
    private service serve;

    @GetMapping("/tasks")
    public List<tasks> toDoList()
    {
        return serve.getTasks();
    }

    @GetMapping("/tasks/{SrNo}")
    public tasks oneItem(@PathVariable String SrNo)
    {
        return serve.getTask(SrNo);
    }

    @PostMapping("/tasks")
    public tasks postTask(@RequestBody tasks tas)
    {
       return serve.addTask(tas);

    }

    @PutMapping("/tasks/{SrNo}")
    public tasks updateTask(@RequestBody tasks tas, @PathVariable String SrNo)
    {
        return serve.updateTask(SrNo,tas);

    }

    @DeleteMapping("/tasks/{SrNo}")
    public boolean deleteTask(@PathVariable String SrNo)
    {
       return serve.deleteTask(SrNo);

    }
}

