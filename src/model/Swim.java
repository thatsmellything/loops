package model;

import javax.swing.JOptionPane;

public class Swim
{

	//--------Data members--------
	private double distance;
	
	public Swim()
	{
		
	}
	
	public Swim(double distance)
	{
		this.distance = distance;
	}
	
	//Getters
	
	public double getDistance()
	{
		return distance;
	}
	
	//Setters
	public void setDistance(double distance)
	{
		this.distance = distance;
	}
	
	public String toString()
	{
		String description = "the distance is " + distance;
		return description;
	}
}
