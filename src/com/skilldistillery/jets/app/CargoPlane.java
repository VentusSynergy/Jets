package com.skilldistillery.jets.app;

import java.util.List;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	public void fly() {
		
		System.out.println();
	}
	
	public void loadCargo() {
		System.out.println("Loading cargo planes\n");
		JetsApplication.displayUserMenu();

		
	}

//	public String toString() {
//		return "Cargo Plane Model: " + getModel() + ", Speed: " + getSpeed() + " mph Range: " + getRange()
//		+ " mi Price: $" + getPrice() + "Flys" + "]\n";
//	}

}
