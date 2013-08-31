/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package todo.domain.service.todo;

import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import todo.domain.model.Todo;

/**
 *
 * @author Owner
 */
public class TodoServiceTest {
    // (1)
    private EJBContainer container;
    private Context context;

    
    public TodoServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        // (2)
        container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        context = container.getContext();
    }
    
    @After
    public void tearDown() {
        // (3)
        container.close();

    }

    /**
     * Test of findAll method, of class TodoService.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        /*
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        TodoService instance = (TodoService)container.getContext().lookup("java:global/classes/TodoService");
        List expResult = null;
        List result = instance.findAll();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        */
        // (4)
        TodoService instance = (TodoService)context.lookup("java:global/classes/TodoService");
        List<Todo> result = instance.findAll();
        System.out.println(result);
        assertNotNull(result);

    }
}