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
public class GetInputExceptions extends Exception {

    public GetInputExceptions() {
    }

    public GetInputExceptions(String message) {
        super(message);
    }

    public GetInputExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public GetInputExceptions(Throwable cause) {
        super(cause);
    }

    public GetInputExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
