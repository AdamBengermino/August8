package com.day.two.one;

public class ParkingLot 
{
	public static void main(String[] args) 
	{
		KeithsCar hisCar = new KeithsCar(); 
		
		Car kavitasCar = new Car(6, 4, true, "Toyota", "Corolla", "Blue", false); 
		
		System.out.println(kavitasCar.getColor()); 
		
		Car erinsCar = new Car(5, 4, false, "Chevy", "Sonic", "White", false); 
		
		System.out.println(erinsCar.isRuns());
		
	}
}
