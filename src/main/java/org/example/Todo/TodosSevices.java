package org.example.Todo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TodosSevices {
    private List<Todo> data = new ArrayList<>( Arrays.asList(
            new Todo(1,"First Todo","This First Todo"),
            new Todo(2,"First Todo","This Second Todo"),
            new Todo(3,"First Todo","This Third Todo"))

    );

    public List<Todo> findall() {
        return data;

    }

    public Todo getid(int id) {
        for (Todo  todos :data){

            if (todos.getId()== id)
                return todos;
        }
        return null;
    }
    public boolean save(Todo todo){
        return data.add(todo);
    }
    public boolean delete(int id ) {
        for (Todo todos : data) {

            if (todos.getId() == id) {
                return data.remove(todos);
            }
        }
        return false;
    }
}
