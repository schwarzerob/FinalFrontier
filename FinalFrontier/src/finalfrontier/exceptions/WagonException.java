/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.exceptions;

/**
 *
 * @author rschw
 */
public class WagonException extends Exception{

    public WagonException() {
    }

    public WagonException(String message) {
        super(message);
    }

    public WagonException(String message, Throwable cause) {
        super(message, cause);
    }

    public WagonException(Throwable cause) {
        super(cause);
    }

    public WagonException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
