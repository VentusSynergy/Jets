package com.skilldistillery.jets.app;

public class FighterJet extends Jet implements CombatReady {
	
	

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void fly() {
		
		double time = range/speed;
		System.out.println(time);
		
		

	}
	
	public void fight() {
		
	}

	@Override
	public String toString() {
		return "FighterJet Model: " + getModel() + ", Speed: " + getSpeed() + " mph " + "Range: " + getRange()
				+ " mi Price: $" + getPrice() + "]\n";
	}

}
