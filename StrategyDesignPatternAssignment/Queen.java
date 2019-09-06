package StrategyDesignPatternAssignment;

//Henry Vy

public class Queen extends Character
{
	// Constructor
	public Queen(String name)
	{
		super(name);
		weaponBehavior = new WeaponKnife();// Extended from Character class assign to WeaponKnife class
	}
	
	// Displays name info
	public void display()
	{
		System.out.println(name + " is a beautiful queen");
	}
}
