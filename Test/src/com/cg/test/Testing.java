package com.cg.test;

class Native
{
    static
    {
        System.loadLibrary("Native library path");
    }
    public native void m();
   
}
public class Testing
{
    public static void main(String[] args)
    {
        Native n = new Native();
        n.m();
    }
}