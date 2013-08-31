/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package todo.app.todo;

import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import todo.domain.model.Todo;
import todo.domain.service.todo.TodoService;
import javax.ws.rs.PathParam;
/**
 *
 * @author Owner
 */

@Path("todos")
public class TodoResource {
    @EJB // (1)
    protected TodoService todoService;

    @GET // (2)
    @Produces(MediaType.APPLICATION_JSON)  // (3)
    public List<Todo> getTodos() {
        return todoService.findAll(); // (4)
    }
    
    @GET
    @Path("{todoId}") // (1)
    @Produces(MediaType.APPLICATION_JSON)
    public Todo getTodo(@PathParam("todoId") Integer todoId) { //(2)
        return todoService.findOne(todoId);
    }

}
