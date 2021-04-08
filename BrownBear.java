import java.util.Arrays;
import java.util.List;

public class BrownBear extends Animal implements Walkable, Swimmable
{
	private String subSpecies;
	
	String[] species = {"Alaskan", "Asiatic", "European", "Grizzly", "Kodiak", "Siberian"};
	List<String> list = Arrays.asList(species);
	
	public BrownBear()
	{
		super();
		subSpecies = "Alaskan";
	}
	
	public BrownBear(int simID, Location l, String subSpecies) throws InvalidSimIDException, InvalidSubspeciesException
	{
		super(simID, l);

		try
		{
			setSubSpecies(subSpecies);
		}
		catch(InvalidSubspeciesException e)
		{
			throw e;
		}
	}
	
	//getter
	public String getSubSpecies()
	{
		return subSpecies;
	}
	
	//setter
	public void setSubSpecies(String subSpecies) throws InvalidSubspeciesException
	{
		InvalidSubspeciesException problem = new InvalidSubspeciesException("Species is not found in list.");
		
		if(!list.contains(subSpecies))
		{
			throw problem;
		}
		this.subSpecies = subSpecies;
	}
	
	public void walk(int direction)
	{
		int [] newArr = location.getCoordinates();
		int newX = newArr[0];
		int newY = newArr[1];
		
		if(direction > 0)
		{
			newX += 3;
			newY += 3;
		}
		else if(direction < 0)
		{
			newX -= 3;
			newY -= 3;
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
	
	public void swim(int direction)
	{
		int [] newArr = location.getCoordinates();
		int newX = newArr[0];
		int newY = newArr[1];
		
		if(direction > 0)
		{
			newX += 2;
			newY += 2;
		}
		else if(direction < 0);
		{
			newX -= 2;
			newY -= 2;
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
}
