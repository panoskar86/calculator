/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Πανος
 */

public class math {
    
    
    public double add(double a,double b)
    {
        return a+b;
    }
    
    public double abstraction(double a,double b)
    {
        return a-b;
    }
    
    public double divide(double a,double b)
    {
        return a/b;
    }
    
    public double multiply(double a,double b)
    {
        return a*b;
    }
    
    public double square(double a)
    {
        return  Math.pow(a, 2);
    }
    public double cube(double a)
    {
        return Math.pow(a, 3);
    }
    
    public double power (double a,double b)
    {
        return Math.pow(a, b);
    }
    public double mod(double a,double b)
    {
        return a%b;
    }
}
