/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nagad;

import javax.swing.JOptionPane;

public class polyTWO extends polymorphism{

    @Override
    void cas(){
        nx=Integer.parseInt(JOptionPane.showInputDialog("Enter Received Account Number:"));
        while(1300000000>=nx)
                    nx=Integer.parseInt(JOptionPane.showInputDialog("Invalid Account Number:"));
        
                     amount=Integer.parseInt(JOptionPane.showInputDialog("Enter Amount"));
                     ref=JOptionPane.showInputDialog("Enter Refferance:");
                     pin=Integer.parseInt(JOptionPane.showInputDialog("""
                                                                      Case Out
                                                                      To:"""+nx+"\nAmount: Tk "+amount+"Ref: "+ref+"\nEnter PIN:")+d);
                    if(pin==1111)
                    JOptionPane.showMessageDialog(null,"""
                                                       Send Money
                                                       To: """+nx+"\nAmount: Tk "+amount+"Ref: "+ref+" was successfull.\nCurrent balance is "+(10000-amount)+d);
                    else
                    {
                        chack();
                        
                    }
    }
}
