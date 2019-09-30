package com.skilldistillery.jets.app;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet() {

	}

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void fly(double t) {
		super.fly(t);
		System.out.println("Flight time: " + t + " hours\n");

	}

	public void fight() {
		System.out.println("\n** FIGHTER JETS ARE READY TO FIGHT **\n");
		JetsApplication.displayUserMenu();

	}

	@Override
	public String toString() {
		return "FIGHTER JET | Model " + getModel() + ", Speed: " + getSpeed() + " mph " + "Range: " + getRange() + " mi Price: $"
				+ getPrice() + "]\n";
	}

}
