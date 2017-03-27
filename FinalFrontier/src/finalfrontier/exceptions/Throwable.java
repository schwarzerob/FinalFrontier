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
public class Throwable extends Exception{

    public Throwable() {
    }

    public Throwable(String message) {
        super(message);
    }

    public Throwable(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public Throwable(java.lang.Throwable cause) {
        super(cause);
    }

    public Throwable(String message, java.lang.Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
