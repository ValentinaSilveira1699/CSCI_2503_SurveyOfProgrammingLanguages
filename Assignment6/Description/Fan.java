/**
 * File: Fan.java
 * Course: CSCI 2503
 * Author: Christopher Williams 
 * Created on: Oct 1, 2021
 * Description: Create a class to represent a Fan object
 */

public class Fan {
	// Implement fan class
	private int speed;
	private double radius;
	private String color;

	// create a default no-arg constructor
	public Fan() {
		setSpeed(1);
		setRadius(1.53);
		setColor("green");
	}
	
	// create a convenience constructor
	public Fan(double newRadius) {
		setRadius(newRadius);
	}

	// create a method to return a string description of the fan
	@Override
	public String toString() {
		return String.format("A %.2f inch %s fan at a speed of %d", 
				getRadius(), getColor(), getSpeed());
	}

	// Accessors/Mutators below
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}