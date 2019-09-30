package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirField {
	private static List<Jet> jets = new ArrayList<>();
	private double t;

	public AirField() {

	}

	public void oldList() {
		FileReader fr = null;
		String fileName = "jet.txt";

		try {
			fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String fileRead = br.readLine();

			while (fileRead != null) {
				String[] file = fileRead.split(", ");
				String tempModel = file[0];
				double tempSpeed = Double.parseDouble(file[1]);
				int tempRange = Integer.parseInt(file[2]);
				long tempPrice = Long.parseLong(file[3]);

				if (tempModel.charAt(0) == 70) {
					Jet tempObj = new FighterJet(tempModel, tempSpeed, tempRange, tempPrice);
					jets.add(tempObj);

					fileRead = br.readLine();
				} else if (tempModel.charAt(0) == 67) {
					Jet tempObj = new CargoPlane(tempModel, tempSpeed, tempRange, tempPrice);
					jets.add(tempObj);

					fileRead = br.readLine();

				} else if (tempModel.charAt(0) == 66) {
					Jet tempObj = new BasicJet(tempModel, tempSpeed, tempRange, tempPrice);
					jets.add(tempObj);

					fileRead = br.readLine();

				}

			}

			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void currentList() {
		System.out.println(jets);
		JetsApplication.displayUserMenu();
	}

	public void addToList(Jet f) {
		jets.add(f);
		System.out.println(jets);
		JetsApplication.displayUserMenu();

	}

	public void fastestJet() {
		System.out.println(jets.size());
		Jet j = null;
		double fastestSpeed = 0;
		for (int i = 0; i < jets.size(); i++) {
			double currentSpeed = jets.get(i).getSpeed();
			if (currentSpeed > fastestSpeed) {
				fastestSpeed = currentSpeed;
				j = jets.get(i);
			}

		}
		System.out.println("Fastest jet: " + j);
		JetsApplication.displayUserMenu();

	}

	public void highestRange() {
		System.out.println(jets.size());
		Jet j = null;
		int longestRange = 0;
		for (int i = 0; i < jets.size(); i++) {
			int currentRange = jets.get(i).getRange();
			if (currentRange > longestRange) {
				longestRange = currentRange;
				j = jets.get(i);
			}

		}
		System.out.println("Jet with longest range: " + j);
		JetsApplication.displayUserMenu();

	}

	public void deleteJet() {
		Scanner sc = new Scanner(System.in);
		int input;
		int id = 1;

		System.out.println("Choose by index to delete jet :( ");
		for(int i = 0; i < jets.size(); i ++) {
			System.out.println("I.D. Number: " + id + " " + jets.get(i));
			id++;
		}
		input = sc.nextInt();
		input = input - 1;
		jets.remove(input);
		JetsApplication.displayUserMenu();

	}

	public void insertToFly() {
		FighterJet f = new FighterJet();

		for (int i = 0; i < jets.size(); i++) {
			double s = jets.get(i).getSpeed();
			int r = jets.get(i).getRange();
			t = r / s;
			int rt = (int) (t * 10);
			t = (double) rt;
			t = t / 10;
			System.out.print(jets.get(i));
			f.fly(t);


		}
		JetsApplication.displayUserMenu();

	}

}
