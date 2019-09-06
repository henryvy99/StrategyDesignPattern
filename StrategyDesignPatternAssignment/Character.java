package StrategyDesignPatternAssignment;

//Henry Vy

public abstract class Character 
{
	// Declaration
	protected String name;
	WeaponBehavior weaponBehavior;
	
	// constructor
	public Character(String name)
	{
		this.name = name;
	}
	
	// display info method
	public abstract void display();
	
	// attack method
	public void attack()
	{
		weaponBehavior.attack(); // calls WeaponBehavior class, then prints out the weapon of the character assigned to it 
	}
	
	// Setter method
	public void setWeaponBehavior(WeaponBehavior wb)
	{
		weaponBehavior = wb;
	}
}
