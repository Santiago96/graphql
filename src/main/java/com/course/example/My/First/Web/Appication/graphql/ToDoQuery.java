package com.course.example.My.First.Web.Appication.graphql;


import com.course.example.My.First.Web.Appication.entities.ToDo;
import com.course.example.My.First.Web.Appication.services.ToDoService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ToDoQuery implements GraphQLQueryResolver {

    @Autowired
    private ToDoService toDoService;

    public List<ToDo> getOwner(String owner) {
        return toDoService.getToDoListByOwner(owner);
    }

}
