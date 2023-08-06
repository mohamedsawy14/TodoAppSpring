package org.example.Todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value ="/api/todo" )
public class TodoController {
    @Autowired
    private TodosSevices todosSevices;
    @GetMapping("/")
    public List <Todo> getAllTodos(){
        return todosSevices.findall();
    }

    @GetMapping("/{id}")
    public Todo getTodobyId(@PathVariable int id){
        return todosSevices.getid( id);

    }
    @PostMapping(value = {"/"})
    public Todo createnewTodo(@RequestBody Todo todo){
        if (todosSevices.save(todo)){
            return todo;
        }
        return null;

    }
    @DeleteMapping(value = {"/{id}"})
    public void deleteTodo(@PathVariable int id){
        todosSevices.delete(id);
    }
}
