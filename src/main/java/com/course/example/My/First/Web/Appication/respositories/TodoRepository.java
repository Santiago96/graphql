package com.course.example.My.First.Web.Appication.respositories;

import com.course.example.My.First.Web.Appication.entities.ToDo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<ToDo, Long> {

    List<ToDo> findByOwner(String owner);
}
