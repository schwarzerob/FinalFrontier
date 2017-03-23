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
public class CraftingControlException  extends Exception{

    public CraftingControlException() {
    }

    public CraftingControlException(String message) {
        super(message);
    }

    public CraftingControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public CraftingControlException(Throwable cause) {
        super(cause);
    }

    public CraftingControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
   
}
