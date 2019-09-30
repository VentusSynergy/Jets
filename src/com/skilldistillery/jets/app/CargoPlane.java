package com.skilldistillery.jets.app;


public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane() {

	}

	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void fly(double t) {
		System.out.println("Flight time: " + t + " hours\n");
	}

	public void loadCargo() {
		System.out.println("\n** LOADING CARGO PLANES **\n");
		JetsApplication.displayUserMenu();

	}
	@Override
	public String toString() {
		return "CARGO PLANE | Model " + getModel() + ", Speed: " + getSpeed() + " mph " + "Range: " + getRange() + " mi Price: $"
				+ getPrice() + "]\n";
	}

}
