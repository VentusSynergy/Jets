package com.skilldistillery.jets.app;

public abstract class Jet {
	private String model;
	private double speed;
	private int range;
	private long price;
	
	public Jet (String model, double speed, int range, long price) {
		
	}
	public abstract void fly();
	
	public double getSpeedInMach(double s) {
		return s;
		
	}
	

}
