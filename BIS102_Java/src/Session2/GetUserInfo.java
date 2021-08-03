package Session2;

import java.util.Scanner;

public class GetUserInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int age;
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("Please Enter your name -> ");
		name = inputDevice.nextLine();
		System.out.println("Please Enter Your age -> ");
		age = inputDevice.nextInt();
		System.out.println("Your name is "+name+" and you are "+age+" years old");
	}

}
