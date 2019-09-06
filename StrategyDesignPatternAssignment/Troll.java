package StrategyDesignPatternAssignment;

//Henry Vy

public class Troll extends Character
{
	public Troll(String name) // Constructor
	{
		super(name);
		weaponBehavior = new WeaponAxe(); // Extended from Character class assign to WeaponAxe class
	}
	
	// displays name info
	public void display()
	{
		System.out.println(name + " is a funny troll");
	}
}
