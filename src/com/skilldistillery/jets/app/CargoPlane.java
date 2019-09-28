package com.skilldistillery.jets.app;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void fly() {
		
		double time = range/speed;
		System.out.println(time);
	}
	
	public void loadCargo() {
		
	}

	@Override
	public String toString() {
		return "Cargo Plane Model: " + getModel() + ", Speed: " + getSpeed() + " mph Range: " + getRange()
		+ " mi Price: $" + getPrice() + "]\n";
	}

}
