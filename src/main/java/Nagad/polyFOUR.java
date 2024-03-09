/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nagad;

import javax.swing.JOptionPane;


public class polyFOUR extends polymorphism{
    @Override
    void cas(){
         nx=Integer.parseInt(JOptionPane.showInputDialog("Enter Merchant A/c Number:"));
                 while(1300000000>=nx){
                     nx=Integer.parseInt(JOptionPane.showInputDialog("Invalid Account Number:"));}
                     amount=Integer.parseInt(JOptionPane.showInputDialog("Enter Amount"));
                     nu=Integer.parseInt(JOptionPane.showInputDialog("Enter Merchant A/c Number:"));
                 while(1300000000>=nu){
                     nu=Integer.parseInt(JOptionPane.showInputDialog("Invalid Account Number:"));}
                     ref=JOptionPane.showInputDialog("Enter Refferance:");
                     pin=Integer.parseInt(JOptionPane.showInputDialog("""
                                                                      Payment
                                                                      To:"""+nx+"\nAmount: Tk "+amount+"\nCounter :"+nu+"\nReference :"+ref+"\nEnter PIN:"));
                    if(pin==1111)
                    JOptionPane.showMessageDialog(null,"""
                                                       Payment
                                                       To: """+nx+"\nAmount: Tk "+amount+"\nCounter :"+nu+"\nReference :"+ref+" was successfull."+d);
                    else
                    {
                        chack();
                    }
    }
}