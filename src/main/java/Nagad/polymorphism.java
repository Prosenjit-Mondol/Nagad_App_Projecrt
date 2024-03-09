
package Nagad;

import javax.swing.JOptionPane;

public class polymorphism extends parent {
    
    
    
    void chack(){
        while (pin!=1111) {
                             wrong=Integer.parseInt(JOptionPane.showInputDialog("Invilid PIN.\nEnter PIN:"));
                            if(wrong==1111){
                                JOptionPane.showMessageDialog(null,"""
                                                                   Case Out
                                                                   To: """+nx+"\nAmount: Tk "+amount+" was successfull.\nCurrent balance is "+(10000-amount)+d);
                                break;
                            }
                        }
    }
   void cas(){
        nx=Integer.parseInt(JOptionPane.showInputDialog("Enter Uddokta a/c Number:"));
        while(1300000000>=nx)
                    nx=Integer.parseInt(JOptionPane.showInputDialog("Invalid Account Number:"));
                     amount=Integer.parseInt(JOptionPane.showInputDialog("Enter Amount"));
                     pin=Integer.parseInt(JOptionPane.showInputDialog("""
                                                                      Case Out
                                                                      To:"""+nx+"\nAmount: Tk "+amount+"\nEnter PIN:"));
                    if(pin==1111)
                    JOptionPane.showMessageDialog(null,"""
                                                       Case Out
                                                       To: """+nx+"\nAmount: Tk "+amount+" was successfull.\nCurrent balance is "+(10000-amount)+d);
                    else
                    {
                        chack();
                        
             }
   }
   
}
