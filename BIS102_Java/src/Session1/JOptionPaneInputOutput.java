package Session1;

import javax.swing.JOptionPane;

public class JOptionPaneInputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String customerName, strNumber, strBalance;
		String output = "";
		
		customerName = JOptionPane.showInputDialog("Enter Account Holder Name");
		strNumber = JOptionPane.showInputDialog("Enter Account Number ");
		strBalance = JOptionPane.showInputDialog("Enter Balance ");
		
		output = "Hello " + customerName + "\n "+ 
					"Account Number: "+strNumber+"\n"+
					"Account Balance : "+strBalance;
		//System.out.println(output);
		//JOptionPane.showMessageDialog(null, output);
		JOptionPane.showMessageDialog(null,output, "Bank Details",JOptionPane.INFORMATION_MESSAGE);
		

	}

}
