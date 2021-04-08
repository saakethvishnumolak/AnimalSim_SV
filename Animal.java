import java.util.Random;

public abstract class Animal 
{
	protected int simID;
	protected Location location;
	protected boolean full;
	protected boolean rested;
	
	
	public Animal()
	{
		simID = 0;
		location = new Location();
		full = false;
		rested = true;
	}
	
	public Animal(int simID, Location l) throws InvalidSimIDException
	{
		location = l;
		full = false;
		rested = true;
		try
		{
			setSimID(simID);
		}
		catch (InvalidSimIDException e)
		{
			throw e;
		}
	}
	
	//getters
	public int getSimID()
	{
		return simID;
	}
	
	public boolean getFull()
	{
		return full;
	}
	
	public boolean getRested()
	{
		return rested;
	}
	
	public Location getLocation()
	{
		return location;
	}
	
	//setters
	public void setSimID(int simID) throws InvalidSimIDException
	{
		InvalidSimIDException problem = new InvalidSimIDException("SimID out of range.");
		
		if(simID < 0)
		{
			throw problem;
		}
		this.simID = simID;
	}
	
	public void setFull(boolean full)
	{
		this.full = full;
	}
	
	public void setRested(boolean rested)
	{
		this.rested = rested;
	}
	
	public void setLocation(Location l)
	{
		this.location = l;
	}
	
	
	Random random = new Random();
	double randomNumber = random.nextDouble();
	
	public boolean eat()
	{
		if(randomNumber <= 0.5)
		{
			full = false;
		}
		else
		{
			full = true;
		}
		return full;
	}
	
	public boolean sleep()
	{
		if(randomNumber <= 0.5)
		{
			rested = true;
		}
		else
		{
			rested = false;
		}
		return rested;
	}
}
