import java.util.*;

public class Location 
{
	private int xCoord;
	private int yCoord;
	
	public Location()
	{
		xCoord = 0;
		yCoord = 0;
	}
	
	public Location(int x, int y) throws InvalidCoordinateException
	{
		try {
			update(x, y);
		}
		catch(InvalidCoordinateException e)
		{
			throw e;
		}
	}
		
	public void update(int x, int y) throws InvalidCoordinateException
	{
		InvalidCoordinateException ex = new InvalidCoordinateException("X coordinate is out of range.");
		InvalidCoordinateException ey = new InvalidCoordinateException("Y coordinate is out of range.");
		InvalidCoordinateException exy = new InvalidCoordinateException("Both x and y are out of range.");
		
		if(x < 0 && y < 0)
		{
			throw exy;
		}
		else if(x < 0)
		{
			throw ex;
		}
		else if(y < 0)
		{
			throw ey;
		}
		this.xCoord = x;
		this.yCoord = y;

	}
	
	public int[] getCoordinates()
	{
		int [] arr = new int[] {xCoord, yCoord};
		return arr;
	}
}


