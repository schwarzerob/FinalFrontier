/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.exceptions;

/**
 *
 * @author Gabriel
 */
public class wagonControlException extends Exception {

    public wagonControlException() {
    }

    public wagonControlException(String message) {
        super(message);
    }

    public wagonControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public wagonControlException(Throwable cause) {
        super(cause);
    }

    public wagonControlException(String message, Throwable cause, boolean enableSuppression , boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
