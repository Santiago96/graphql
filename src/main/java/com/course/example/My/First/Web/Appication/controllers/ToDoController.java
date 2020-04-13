package com.course.example.My.First.Web.Appication.controllers;

import com.course.example.My.First.Web.Appication.entities.ToDo;
import com.course.example.My.First.Web.Appication.services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Date;
import java.util.List;

@Controller
@SessionAttributes("user")
public class ToDoController {

    @Autowired
    ToDoService toDoService;


    @GetMapping(value = "list-todo")
    public String showToDoList(ModelMap modelMap){
        String user = (String) modelMap.get("user");
        List<ToDo> toDoList = toDoService.getToDoListByOwner("santiago");
        modelMap.put("toDoList", toDoList);
        modelMap.put("user", user);
        return "list-todo";
    }

    @GetMapping(value = "add-todo")
    public String showAddToDo(ModelMap modelMap){
         return "add-todo";
    }

    @PostMapping(value = "add-todo")
    public String addToDo(ModelMap modelMap, @RequestParam String description){
        ToDo toDo = new ToDo();
        toDo.setId(toDoService.getSize()+1);
        toDo.setOwner("santiago");
        toDo.setDescription(description);
        toDo.setStartDate(new Date());
        toDo.setEnabled(false);

        toDoService.addToDo(toDo);
        return "redirect:/list-todo";
    }
}
