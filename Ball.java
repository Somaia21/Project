/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3_1;

/**
 *
 * @author JAM
 */
public abstract class Ball implements Tossable
{
    private String brandName;
    
    public Ball(String brandName)
    {
        this.brandName = brandName;
    }
    
    public String getBrandName()
    {
        return brandName;
    }
    
    public abstract void bounce(); 
}
