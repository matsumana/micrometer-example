package info.matsumana.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import info.matsumana.example.entity.Todo;
import info.matsumana.example.service.TodoService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/")
public class TodoController {

    private final TodoService service;

    @GetMapping("todo")
    List<Todo> index() {
        return service.findAll();
    }
}
