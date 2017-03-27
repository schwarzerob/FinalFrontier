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
public class EventViewExceptions extends Exception{

    public EventViewExceptions() {
    }

    public EventViewExceptions(String message) {
        super(message);
    }

    public EventViewExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public EventViewExceptions(Throwable cause) {
        super(cause);
    }

    public EventViewExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
