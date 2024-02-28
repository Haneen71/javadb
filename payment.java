/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labs.javadb;

import javax.persistence.Column; 
import javax.persistence.Id; 
import javax.persistence.Entity;
import javax.persistence.Table;
 
@Entity
@Table(name = "payment")
public class payment {
    
     @Id 
     @Column(name="CardNumber") 
     private int CardNumber; 
     @Column(name="MM") 
     private int MM;
     @Column(name="YY") 
     private int YY; 
     @Column(name="CVV") 
     private int CVV; 

    public payment() {
    }

    public payment(int CardNumber, int MM, int YY, int CVV) {
        this.CardNumber = CardNumber;
        this.MM = MM;
        this.YY = YY;
        this.CVV = CVV;
    }
    
    public int getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(int CardNumber) {
        this.CardNumber = CardNumber;
    }

    public int getMM() {
        return MM;
    }

    public void setMM(int MM) {
        this.MM = MM;
    }

    public int getYY() {
        return YY;
    }

    public void setYY(int YY) {
        this.YY = YY;
    }

    public int getCVV() {
        return CVV;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
    }
     
     
}
