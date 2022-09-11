package org.example.service;


import lombok.AllArgsConstructor;
import org.example.model.TodoModel;
import org.example.model.TodoRequest;
import org.example.service.repository.TodoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@AllArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;

    public TodoModel add(TodoRequest req){
        TodoModel todoModel = new TodoModel();
        todoModel.setTitle(req.getTitle());
        todoModel.setOrder(req.getOrder());
        todoModel.setCompleted(req.getCompleted());
        return this.todoRepository.save(todoModel);
    }

    public TodoModel searchById(Long id) {
        return this.todoRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public List<TodoModel> searchAll(){
        return this.todoRepository.findAll();
    }

    public TodoModel updateById(Long id, TodoRequest req){
        TodoModel todoModel = this.searchById(id);
        if (req.getTitle() != null){
            todoModel.setTitle(req.getTitle());
        }
        if (req.getOrder() != null){
            todoModel.setOrder(req.getOrder());
        }
        if (req.getCompleted() != null){
            todoModel.setCompleted(req.getCompleted());
        }
        return this.todoRepository.save(todoModel);
    }

    public void deleteById(Long id){
        this.todoRepository.deleteById(id);
    }

    public void deleteAll() {
        this.todoRepository.deleteAll();
    }
}
