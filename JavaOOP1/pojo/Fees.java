/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package op;

/**
 *
 * @author HP
 */
public class Fees 
{
    int fees;
    int dis;
    String status;
    
    public Fees(int fees,int dis,String status) 
    {
        this.fees=fees;
        this.dis=dis;
        this.status=status;
    }

    @Override
    public String toString() {
        return "Fees{" + "fees=" + fees + ", dis=" + dis + ", status=" + status + '}';
    }

    
    public int getFee() {
        return fees;
    }

    public Fees() {
    }

    public int getDis() {
        return dis;
    }

    public String getStatus() {
        return status;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public void setDis(int dis) {
        this.dis = dis;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}
