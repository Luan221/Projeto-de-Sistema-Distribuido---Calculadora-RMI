/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.NotBoundException;

public class Calculadoraservidor {
    public static void main(String[] args) throws RemoteException,NotBoundException
    {
        try
        {
            Registry r = LocateRegistry.createRegistry(1090);
            r.rebind("Calculadora", new Calculadora());
            System.out.println("Servidor esta funcionando");
        }
        catch(Exception e)
                {
                    System.out.println(e);
                }
    }
}
