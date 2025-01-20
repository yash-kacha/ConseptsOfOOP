/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repo;
import op.Fees;
/**
 *
 * @author HP
 */
public class FeesRepo 
{
    public Fees getFees(long Sid)
    {
        return new Fees(10000,1000,"paid");
    }
            
}           
