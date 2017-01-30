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
public class Homestead implements Serializable{
    private String Description;
    private String PurchaseResource;
    private String SellResource;
    
    public Homestead(){
    }
// get and set Description
    public String getDescription() {
        return Description;
    }
    public void setDescription(String Description) {
        this.Description = Description;
    }
// get and set PurchaseResource
    public String getPurchaseResource() {
        return PurchaseResource;
    }
    public void setPurchaseResource(String PurchaseResource) {
        this.PurchaseResource = PurchaseResource;
    }
// get and set SellResource
    public String getSellResource() {
        return SellResource;
    }
    public void setSellResource(String SellResource) {
        this.SellResource = SellResource;
    }
    
}
