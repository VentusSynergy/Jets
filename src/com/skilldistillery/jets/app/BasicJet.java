package com.skilldistillery.jets.app;

public class BasicJet extends Jet {

	public BasicJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void fly() {
		
	}

	@Override
	public String toString() {
		return "BasicJet [getModel()=" + getModel() + ", getSpeed()=" + getSpeed() + ", getRange()=" + getRange()
				+ ", getPrice()=" + getPrice() + "]";
	}

}
