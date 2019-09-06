package StrategyDesignPatternAssignment;

//Henry Vy

public class King extends Character
{
	// constructor
	public King(String name)
	{
		super(name);
		weaponBehavior = new WeaponSword(); // Extended from Character class assign to WeaponSword class
	}
	
	// displays name info
	public void display()
	{
		System.out.println(name + " is a Noble King");
	}
}
