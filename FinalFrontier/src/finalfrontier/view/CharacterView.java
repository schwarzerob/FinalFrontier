/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.view;

import finalfrontier.model.MyCharacter;
import finalfrontier.model.Resources;

/**
 *
 * @author rschw
 */
public class CharacterView extends View{
    public CharacterView() {
        super("\n ************************"
            + "\n * Which character do you want to play?"
            + "\n *L - Lumberjack"
            + "\n *F - Farmer"
            + "\n *B - Blacksmith"
            + "\n *H - Hunter"
            + "\n *S - Soldier"
            + "\n *C - Cashier"
            + "\n ************************");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        int i;
        switch (value){
            case "L":
                this.getResources(0);
                break;
            case "F":
                this.getResources(1);
                break;
            case "B":
                this.getResources(2);
                break;
            case "H":
                this.getResources(3);
                break;
            case "S":
                this.getResources(4);
                break;
            case "C":
                this.getResources(5);
                break;
            default:
                System.out.println("\n*** Invalid selection ***"
                                  +"\n    Try again");
                break;
        }
        
        return false;
    }

    private void getResources(int i) {
        MyCharacter charNames[] = MyCharacter.values();
        Resources.wood=charNames[i].getWood();
        Resources.wood=charNames[i].getGrain();
        Resources.wood=charNames[i].getOre();
        Resources.wood=charNames[i].getSheep();
        Resources.wood=charNames[i].getSwords();
        Resources.wood=charNames[i].getGold();
    }
    
}
