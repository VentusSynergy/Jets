package com.skilldistillery.jets.app;

public class BasicJet extends Jet {

	public BasicJet() {

	}

	public BasicJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void fly(double t) {
		super.fly(t);
		System.out.println("Flight time: " + t + " hours\n");

	}

	@Override
	public String toString() {
		return "BASIC JET | Model " + getModel() + ", Speed: " + getSpeed() + " mph " + "Range: " + getRange() + " mi Price: $"
				+ getPrice() + "]\n";
	}

}
