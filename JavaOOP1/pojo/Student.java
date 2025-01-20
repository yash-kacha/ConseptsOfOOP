/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package op;

import java.util.List;

/**
 *
 * @author HP
 */
public class Student 
{
    
    private List<Adress> adress;
    private Fees fees;
    private Detail detail;

    public Student(List<Adress> adress, Fees fees, Detail detail) {
        this.adress = adress;
        this.fees = fees;
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Student{" + "adress=" + adress + ", fees=" + fees + ", detail=" + detail + '}';
    }

    
    public List<Adress> getAdress() {
        return adress;
    }

    public Fees getFees() {
        return fees;
    }

    public Detail getDetail() {
        return detail;
    }

    public void setAdress(List<Adress> adress) {
        this.adress = adress;
    }

    public void setFees(Fees fees) {
        this.fees = fees;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    
    
}
