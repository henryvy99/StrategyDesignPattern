package StrategyDesignPatternAssignment;

//Henry Vy

public class Knight extends Character
{
	// Constructor
	public Knight(String name) 
	{
		super(name);
		weaponBehavior = new WeaponBow();// Extended from Character class assign to WeaponBow class
	}
	
	// displays name info
	public void display() 
	{
		System.out.println(name + " is a valiant knight");
	}
	
	

}
