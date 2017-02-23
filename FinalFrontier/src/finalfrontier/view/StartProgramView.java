/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.view;

/**
 *
 * @author rschw
 */
    //Describe the game
    //Get the players name
    //call PlayerControl to create a player object
    //If successfull, display welcome banner
public class StartProgramView {
    private String promptMessage;
    
    public StartProgramView(){
        this.promptMessage = "Please enter you name";
        //display the banner when view is created
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(
        "************************"
        + "\n * Description of the game"
        + "\n * It fits well over many rows like this."
        + "\n************************"
        );
    }

    public void displayStartProgramView() {
        boolean done = false; // set flag to not done
        do{
            //Prompt for and get the input value
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q"))
                return;
            //do requested action and display the next view
            done = this.doAction(playersName);
        }while (!done);
        
    }

    private String getPlayersName() {
        
        //Template from pg.18
        /*
        WHILE a valid value has not been entered
            DISPLAY a message prompting the user to enter a value
            GET the value entered from keyboard
            Trim front and trailing blanks off of the value
            IF the length of the value is blank THEN
                DISPLAY “Invalid value: The value cannot be blank”
                CONTINUE
            ENDIF
            BREAK
        ENDWHILE
        RETURN value
        */
    }

    private boolean doAction(String playersName) {
        System.out.println("\n*** doAction() called ***");
        return true;
    }
}




// stopped at start of pg 17 before the "Implement the getPlayersName() function" part