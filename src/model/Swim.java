package model;

public class Swim
{

	//--------Data members--------
	private String name;
	private double distance;
	private String stroke;
	private double time;
	
	
	//---------Constructor-------
	public Swim()
	{
		
	}
	
	//Param for data member
	public Swim(String name, double distance, String stroke, double time)
	{
		this.name = name;
		this.distance = distance;
		this.stroke = stroke;
		this.time = time;
	}
	
	
	
	
	//Getters
	public String getName()
	{
		return name;
	}
	
	public double getDistance()
	{
		return distance;
	}
	
	public String getStroke()
	{
		return stroke;
	}
	public double getTime()
	{
		return time;
	}
	
	//Setters
	public void setName(String name)
	{
		this.name = name;
	}
	public void setDistance(double distance)
	{
		this.distance = distance;
	}
	public void setStroke(String stroke)
	{
		this.stroke = stroke;
	}
	public void setTime(double time)
	{
		this.time = time;
	}
	//I am very confused on how this is supposed to work?
	
	public String toString()
	{
		String description = "Your name is " + name + " and the distance you swam is " + distance + " and your favoriyte stroke is " + stroke + " and you have a best time of " + time + " in that stroke!";
		return description;
	}
}
