package Nagad;

import javax.swing.JOptionPane;


public class inherite extends parent{

    int display(){
        result = Integer.parseInt(JOptionPane.showInputDialog("Nagad\n1. Cash Out\n2. Send Money\n3. Mobile Recharge\n4. Payment\n5. Bill Pay\n6.EMI Payment\n7. My Nagad\n8. PIN Reset"));
        return result;
    }
}

