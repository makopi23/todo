/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package todo.app.todo;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

import todo.domain.model.Todo;
import todo.domain.service.todo.TodoService;


/**
 *
 * @author Owner
 */
@Named(value = "todoController")
@RequestScoped
public class TodoController {
    @EJB // (1)
    protected TodoService todoService;
    
    // (1)
    protected Todo todo = new Todo();

    
    // (2)
    protected List<Todo> todoList;


    /**
     * Creates a new instance of TodoController
     */
    public TodoController() {
    }
    
    public Todo getTodo() {
        return todo;
    }

    
    // (3)
    public List<Todo> getTodoList() {
        return todoList;
    }

    @PostConstruct // (4)
    public void init() {
        todoList = todoService.findAll();
    }
    
    // (2)
    public String create() {
        todoService.create(todo);
        // (3)
        return "list?faces-redirect=true";
    }


}
