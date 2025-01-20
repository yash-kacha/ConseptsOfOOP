/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package op;

/**
 *
 * @author HP
 */
public class Filter 
{
    String city;
    int fees;
    String cast;

    public Filter(String city, int fees, String cast) {
        this.city = city;
        this.fees = fees;
        this.cast = cast;
    }

    @Override
    public String toString() {
        return "Filter{" + "city=" + city + ", fees=" + fees + ", cast=" + cast + '}';
    }

    public String getCity() {
        return city;
    }

    public Filter() {
    }

    public int getFees() {
        return fees;
    }

    public String getCast() {
        return cast;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }
    
    
    
}
