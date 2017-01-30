/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.model;

import java.io.Serializable;
import java.util.Objects;

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
// hashCode
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.Description);
        hash = 67 * hash + Objects.hashCode(this.PurchaseResource);
        hash = 67 * hash + Objects.hashCode(this.SellResource);
        return hash;
    }
// equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Homestead other = (Homestead) obj;
        if (!Objects.equals(this.Description, other.Description)) {
            return false;
        }
        if (!Objects.equals(this.PurchaseResource, other.PurchaseResource)) {
            return false;
        }
        if (!Objects.equals(this.SellResource, other.SellResource)) {
            return false;
        }
        return true;
    }
// toString
    @Override
    public String toString() {
        return "Homestead{" + "Description=" + Description + ", PurchaseResource=" + PurchaseResource + ", SellResource=" + SellResource + '}';
    }
    
}
