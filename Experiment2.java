//Name:- Sahil Pawale  Reg.No:- 20BCE10661

import java.io.*;
import java.util.*;
// Package is name by "default package".
//Define a parent class
class Vehicle implements Serializable 
{
	private String make;
	private String model;
	private int year;
	
	public Vehicle(String make, String model, int year) 
	{
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public String getMake() 
	{
		return make;
	}
	
	public String getModel() 
	{
		return model;
	}
	
	public int getYear() 
	{
		return year;
	}
	
	public void drive() 
	{
		System.out.println("Driving the vehicle");
	}
}

//Define a child class that extends the parent class
class Car extends Vehicle 
{
	private int numDoors;
	
	public Car(String make, String model, int year, int numDoors) 
	{
		super(make, model, year);
		this.numDoors = numDoors;
	}
	
	public int getNumDoors() 
	{
		return numDoors;
	}
	
	public void drive() 
	{
		System.out.println("Driving the car");
	}
}

public class Experiment2 
{
	public static void main(String[] args) 
	{
		// Use an array
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) 
        {
        	System.out.println(numbers[i]);
        }

        // Use exception handling
        try 
        {
        	int a = 5 / 0;
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Use serialization
        try 
        {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("vehicle.ser"));
            Car car = new Car("Toyota", "Corolla", 2022, 4);
            out.writeObject(car);
            out.close();
        } 
        catch (IOException e) 
        {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try 
        {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("vehicle.ser"));
            Car car = (Car) in.readObject();
            in.close();
            System.out.println(car.getMake() + " " + car.getModel() + " " + car.getYear() + " " + car.getNumDoors());
        } 
        catch (IOException | ClassNotFoundException e) 
        {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Use threading
        Runnable task = () -> 
        {
            for (int i = 0; i < 10; i++) 
            {
            	System.out.println("Thread running " + i);
            }
        };
        Thread thread = new Thread(task);
        thread.start();
	}

}
