package com.skilldistillery.jets.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JetsApplication {

	public static void main(String[] args) {
		AirField fl = new AirField();
		fl.jetList();
		displayUserMenu();

	}

	public static void displayUserMenu() {
		AirField t = new AirField();
		
		FighterJet f = new FighterJet(null, 0, 0, 0);
		CargoPlane c;
		BasicJet b;
		Scanner sc = new Scanner(System.in);
		int input = 1;
		
		do {
			System.out.println(" ** MENU ** \n");
			System.out.println("1. List fleet");
			System.out.println("2. Fly all jets");
			System.out.println("3. View fastest jet");
			System.out.println("4. View jet with longest range");
			System.out.println("5. Load all Cargo Jets");
			System.out.println("6. Dogfight!");
			System.out.println("7. Add a jet to Fleet");
			System.out.println("8. Remove a jet from Fleet");
			System.out.println("9. Quit");
			input = sc.nextInt();
			if(input != 1 && input != 2 && input != 3 && input != 4 && input != 5 && input != 6 
					&& input != 7 && input != 8 && input != 9) {
				System.out.println("Invalid input\n");
				
			}
		} while (input != 1 && input != 2 && input != 3 && input != 4 && input != 5 && input != 6 
				&& input != 7 && input != 8 && input != 9);
		switch(input) {
		case 1:
			launch();
			break;
		case 2:
			f.fly();
			
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			String typeJet;
			System.out.println("Enter \"f\" for fighter jet, \"c\" for cargo plane, or \"b\" for basic jet");
			typeJet = sc.next();
			switch(typeJet) {
			case "f":
				String model;
				double speed;
				int range;
				long price;
				System.out.println("Enter model");
				model = sc.next();
				System.out.println("Enter speed");
				speed = sc.nextDouble();
				System.out.println("Enter range");
				range = sc.nextInt();
				System.out.println("Enter price");
				price = sc.nextLong();
				f = new FighterJet(model, speed, range, price);
				t.currentList(f);
				
			}
			break;
		case 8:
			break;
		case 9:
			sc.close();
			break;
		}
		
		

	}

	public static void launch() {
		displayUserMenu();

	}

}
