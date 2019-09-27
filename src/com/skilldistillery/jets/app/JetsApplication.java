package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JetsApplication {
	private AirField fl;

	public static void main(String[] args) {
		launch();
		displayUserMenu();

	}

	public static void displayUserMenu() {
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
		System.out.println("made");
		switch(input) {
		case 1:
			break;
		case 2:
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
			break;
		case 8:
			break;
		case 9:
			sc.close();
			break;
		}
		
		

	}

	public static void launch() {
		FileReader fr = null;
		String fileName = "jet.txt";
		List<Jet> jets = new ArrayList<>();
		String currentJet = "";


		try {
			fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);


			for (int i = 0; i < 5; i++) {
				fr = new FileReader(fileName);
				br = new BufferedReader(fr);
				currentJet = br.readLine();
				
				System.out.println(currentJet);

			}

			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(jets);

	}

}
