package com.cg.inheritance;

class Derived extends Object
{
    public void getDetails()
    {
        System.out.printf("Derived class ");
    }
}
 
public class Test extends Derived
{
    public void getDetails()
    {
        System.out.printf("Test class ");
        getDetails();
    }
    public static void main(String[] args)
    {
        Test obj = new Test();
        obj.getDetails();
    }
}