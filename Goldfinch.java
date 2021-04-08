
public class Goldfinch extends Animal implements Walkable, Flyable
{
	private double wingSpan;
	
	public Goldfinch()
	{
		super();
		wingSpan = 9.0;
	}
	
	public Goldfinch(int simID, Location l, double ws) throws InvalidSimIDException, InvalidWingspanException
	{
		super(simID, l);
		
		try 
		{
			setWingSpan(ws);
		}
		catch(InvalidWingspanException e)
		{
			throw e;
		}
	}
	
	//getter
	public double getWingSpan()
	{
		return wingSpan;
	}
	
	//setter
	public void setWingSpan(double ws) throws InvalidWingspanException
	{
		InvalidWingspanException problem = new InvalidWingspanException("Wingspan out of range.");
		
		if(ws < 5.0 || ws > 11.0)
		{
			throw problem;
		}
		wingSpan = ws;
	}
	
	public void walk(int direction) 
	{
		int [] newArr = location.getCoordinates();
		int newX = newArr[0];
		int newY = newArr[1];
		if(direction > 0)
		{
			newX += 1;
			newY += 1;
		}
		else if(direction < 0)
		{
			newX -= 1;
			newY -= 1;
		}
		
		try
		{
			location.update(newX, newY);
		}
		catch (InvalidCoordinateException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	public void fly(Location l)
	{
		this.location = l;
	}
}
