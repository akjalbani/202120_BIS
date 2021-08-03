package Session2;

import javax.swing.JOptionPane;

public class GSTCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 final double GSTRATE = 0.1;
		 String sSalePrice, item;
		 double dblGstAmount, dblSalePrice, totalAfterGst;
		 String message = " ";
		 item = JOptionPane.showInputDialog("Enter ITEM");
		 
		 sSalePrice = JOptionPane.showInputDialog("Please Enter Sale Amount");
		 dblSalePrice = Double.parseDouble(sSalePrice);
		 
		 dblGstAmount = GSTRATE * dblSalePrice;
		 totalAfterGst = dblSalePrice * dblGstAmount;
		 
		 message = "ITEM: "+item+
				 "\n\n\n Sales Price : $"+dblSalePrice+
				 "\n GST Amount : $"+dblGstAmount+ 
				 "\n Price After GST: $"+totalAfterGst;
		 JOptionPane.showMessageDialog(null, message,"GST Calculator", JOptionPane.INFORMATION_MESSAGE);
		 

	}

}
