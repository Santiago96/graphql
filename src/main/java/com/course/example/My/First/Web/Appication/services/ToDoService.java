package com.course.example.My.First.Web.Appication.services;

import com.course.example.My.First.Web.Appication.entities.ToDo;
import com.course.example.My.First.Web.Appication.respositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ToDoService {

    @Autowired
    private TodoRepository todoRepository;

    static List<ToDo> toDoList = new ArrayList<>();

    static {
        ToDo todo1 = new ToDo(1, "santiago", "Learn Angular", new Date(), true);
        ToDo todo2 = new ToDo(2, "santiago", "Learn Docker", new Date(), true);
        ToDo todo3 = new ToDo(3, "santiago", "Learn AWS", new Date(), true);
        ToDo todo4 = new ToDo(4, "julian", "Learn Spring", new Date(), true);

        toDoList.add(todo1);
        toDoList.add(todo2);
        toDoList.add(todo3);
        toDoList.add(todo4);
    }


    public List<ToDo> getToDoListByOwner(String owner) {
        List<ToDo> resultList = toDoList.stream().filter(
                toDo -> toDo.getOwner().equalsIgnoreCase(owner)
        ).collect(Collectors.toList());

        return todoRepository.findByOwner(owner);

        //return resultList;
    }

    public ToDo addToDo(ToDo toDo) {
        toDoList.add(toDo);
        return todoRepository.save(toDo);
    }

    public static int getSize(){
        return toDoList.size();
    }
}
