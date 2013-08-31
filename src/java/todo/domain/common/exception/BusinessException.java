/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package todo.domain.common.exception;
import javax.ejb.ApplicationException;
/**
 *
 * 
 * @author Owner
 */
@ApplicationException
public class BusinessException extends RuntimeException{
    public BusinessException(String message) {
        super(message);
    }
}
