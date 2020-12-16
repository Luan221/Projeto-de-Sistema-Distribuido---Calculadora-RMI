/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;


public class Calculadoraclient {
       public static void main(String[] args) throws NotBoundException,RemoteException, MalformedURLException {
        // TODO code application logic here
        Scanner sc  =  new Scanner(System.in);
        try
        {
            Calculadorainterface c = (Calculadorainterface) Naming.lookup("//localhost:1090/Calculadora");
            System.out.println("O cliente esta conectado ao servidor");
            System.out.println("Escolha uma opcao");
            System.out.println("1.Adicao \n");
            System.out.println("2.Subtracao \n");
            System.out.println("3.Multiplicação \n");
            System.out.println("4.Divisao \n");
            int choice  = sc.nextInt();
            int x,y;
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Digite dois numeros");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    System.out.println("resultado:"+c.add(x, y));
                }
                   case 2:
                {
                    System.out.println("Digite dois numeros");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    System.out.println("resultado:"+c.sub(x, y));
                }
                   case 3:
                {
                    System.out.println("Digite dois numeros");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    System.out.println("resultado:"+c.mul(x, y));
                }
                   case 4:
                {
                    System.out.println("Digite dois numeros");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    System.out.println("resultado:"+c.div(x, y));
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
