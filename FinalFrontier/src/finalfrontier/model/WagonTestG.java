/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.model;

import java.io.Serializable;

/**
 *
 * @author rschw
 */
public class WagonTestG implements Serializable {
    
    int wood;
    int gold;
    int grain;
    int swords;
    int ore;
    int sheep;
            
    
    char[] wagonResources = new char[5];
    int[] amountResources = {wood, gold, grain, swords, sheep, ore};
    
            
}
