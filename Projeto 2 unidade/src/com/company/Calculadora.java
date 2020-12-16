/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Calculadora extends UnicastRemoteObject implements Calculadorainterface {
    
    public Calculadora() throws RemoteException
    {
        int a,b;
    }
    @Override
    public int add(int a,int b) throws RemoteException
    {
        return a+b;
    }
    @Override
      public int sub(int a,int b) throws RemoteException
    {
        return a-b;
    }
    @Override
    public int mul(int a,int b) throws RemoteException
    {
        return a*b;
    }
    @Override
    public int div(int a,int b) throws RemoteException
    {
        return a/b;
    }


 
    
}
