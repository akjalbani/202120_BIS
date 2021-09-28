import javax.swing.*;

public class Person {
	private String firstName;
	private String lastName;
	private String streetAddress;
	private String zipcode;
	private String phoneNumber;
	
	public void setData() {
		firstName = JOptionPane.showInputDialog(null, "Please enter first name");
		lastName = JOptionPane.showInputDialog(null, "Please enter last name");
		streetAddress = JOptionPane.showInputDialog(null, "Please enter address");
		zipcode = JOptionPane.showInputDialog(null, "Please enter zip code");
		phoneNumber = JOptionPane.showInputDialog(null, "Please enter phone number");
		
	}
	public void display() {
        System.out.println(firstName + " " + lastName +
                " " + streetAddress + " " + zipcode + " " + phoneNumber);
	}

}
