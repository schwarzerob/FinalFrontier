/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.view;

import finalfrontier.FinalFrontier;
import java.io.PrintWriter;

/**
 *
 * @author rschw
 */
public class ErrorView {
    private static final PrintWriter errorFile = FinalFrontier.getOutFile();
    private static final PrintWriter logFile = FinalFrontier.getLogFile();
    
    public static void display(String className, String errorMessage){
        errorFile.println(
            "------------------" +
            "\n-Error-"+ errorMessage +
            "\n------------------");
        
        logFile.println(className + " - " + errorMessage);
    }
}
