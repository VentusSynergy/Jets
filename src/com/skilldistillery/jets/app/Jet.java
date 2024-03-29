package com.skilldistillery.jets.app;

public abstract class Jet {
	private String model;
	private double speed;
	private int range;

	public String toString() {
		return "Jet Model: " + getModel() + ", Speed: " + getSpeed() + " mph " + "Range: " + getRange() + " mi Price: $"
				+ getPrice() + "]\n";
	}

	private long price;

	public Jet(String model, double speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public Jet() {

	}

	public abstract void fly(double t);

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public double getSpeedInMach(double s) {
		return s;

	}

}
