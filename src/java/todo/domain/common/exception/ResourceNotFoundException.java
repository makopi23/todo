/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package todo.domain.common.exception;
import javax.ejb.ApplicationException;
/**
 *
 * @author Owner
 */
@ApplicationException
public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String message) {
        super(message);
    }
}

