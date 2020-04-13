package com.course.example.My.First.Web.Appication.graphql;

import com.course.example.My.First.Web.Appication.entities.ToDo;
import com.course.example.My.First.Web.Appication.services.ToDoService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ToDoMutation implements GraphQLMutationResolver {

    @Autowired
    private ToDoService toDoService;

    public ToDo addToDo(String owner, String description, boolean isEnabled){
        ToDo toDo = new ToDo();

        toDo.setOwner(owner);
        toDo.setDescription(description);
        toDo.setEnabled(isEnabled);

        return toDoService.addToDo(toDo);
    }

}
