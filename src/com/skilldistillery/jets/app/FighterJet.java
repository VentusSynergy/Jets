package com.skilldistillery.jets.app;

public class FighterJet extends Jet implements CombatReady {
	
	

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void fly() {
		
		
		
		

	}
	
	public void fight() {
		System.out.println("Ready to fight !!!\n");
		JetsApplication.displayUserMenu();
		
	}

//	public String toString() {
//		return "FighterJet Model: " + getModel() + ", Speed: " + getSpeed() + " mph " + "Range: " + getRange()
//				+ " mi Price: $" + getPrice() + "]\n";
//	}

}
