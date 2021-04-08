
public class Application 
{

	public static void main(String[] args) 
	{
		//Location Tests
		System.out.println("*********************************************");
		System.out.println("Location Tests");
		System.out.println("*********************************************");
		
		
		try
		{
			Location l = new Location();
			l.update(3, 4);
			int[] arr = l.getCoordinates();
			System.out.println("x = " + arr[0] + ", y = " + arr[1]);
		}
		catch(InvalidCoordinateException e)
		{
			System.out.println(e.getMessage());
		}
		
		try
		{
		Location location = new Location(5, 7);
		location.update(7, 8);
		int[] arr = location.getCoordinates();
		System.out.println("Updated: x = " + arr[0] + ", y = " + arr[1]);
		location.update(-1, 0);
		System.out.println("x = " + arr[0] + ", y = " + arr[1]);

		}
		catch(InvalidCoordinateException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
		//Animal Tests
		System.out.println("*********************************************");
		System.out.println("Animal Tests");
		System.out.println("*********************************************");
		
		/*try
		{
			Animal animal = new Animal();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		} */
		//You cannot create an object for abstract class because it is an incomplete class. It does not have a body or output. 
		
		
		
		//Goldfinch Tests
		System.out.println("*********************************************");
		System.out.println("Goldfinch Tests");
		System.out.println("*********************************************");
		
		
		//Test Empty Constructor
		Goldfinch gold = new Goldfinch();
		System.out.println("Sim ID: " + gold.getSimID());
		Location location = gold.getLocation();
		int[] arr =  location.getCoordinates();
		System.out.println("Location: x = " + arr[0] + ", y = " + arr[1]);
		System.out.println("Full: " + gold.getFull());
		System.out.println("Rested: " + gold.getRested());
		System.out.println("Wing Span: " + gold.getWingSpan());
		
		System.out.println("*********************************************");
		
		//Test Passed Parameter Constructor
		try
		{
			Location l = new Location(6, 11);
			int [] a = l.getCoordinates();
			Goldfinch finch = new Goldfinch(5, l, 7.0);
			System.out.println("Sim ID: " + finch.getSimID());
			System.out.println("Location: x = " + a[0] + ", y = " + a[1]);
			System.out.println("Full: " + finch.getFull());
			System.out.println("Rested: " + finch.getRested());
			System.out.println("Wing Span: " + finch.getWingSpan());
		}
		catch(InvalidCoordinateException e)
		{
			System.out.println(e.getMessage());
		}
		catch(InvalidSimIDException e)
		{
			System.out.println(e.getMessage());
		}
		catch(InvalidWingspanException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("*********************************************");

		//Failed Constructor
		
		Location l;
		int[] a;
		Goldfinch finch;
		
		//InvalidCoordinateException
		try
		{
			l = new Location(6, -11);
			a = l.getCoordinates();
			finch = new Goldfinch(5, l, 7.0);
			System.out.println("Sim ID: " + finch.getSimID());
			System.out.println("Location: x = " + a[0] + ", y = " + a[1]);
			System.out.println("Full: " + finch.getFull());
			System.out.println("Rested: " + finch.getRested());
			System.out.println("Wing Span: " + finch.getWingSpan());
		}
		catch(InvalidCoordinateException e)
		{
			System.out.println(e.getMessage());
		}
		catch(InvalidSimIDException e)
		{
			System.out.println(e.getMessage());
		}
		catch(InvalidWingspanException e)
		{
			System.out.println(e.getMessage());
		}
		
		//InvalidSimIDException
		try
		{
			l = new Location(2, 11);
			a = l.getCoordinates();
			finch = new Goldfinch(-3, l, 7.0);
			System.out.println("Sim ID: " + finch.getSimID());
			System.out.println("Location: x = " + a[0] + ", y = " + a[1]);
			System.out.println("Full: " + finch.getFull());
			System.out.println("Rested: " + finch.getRested());
			System.out.println("Wing Span: " + finch.getWingSpan());
		}
		catch(InvalidCoordinateException e)
		{
			System.out.println(e.getMessage());
		}
		catch(InvalidSimIDException e)
		{
			System.out.println(e.getMessage());
		}
		catch(InvalidWingspanException e)
		{
			System.out.println(e.getMessage());
		}
		
		//InvalidWingspanException
		try
		{
			l = new Location(2, 11);
			a = l.getCoordinates();
			finch = new Goldfinch(3, l, 12.0);
			System.out.println("Sim ID: " + finch.getSimID());
			System.out.println("Location: x = " + a[0] + ", y = " + a[1]);
			System.out.println("Full: " + finch.getFull());
			System.out.println("Rested: " + finch.getRested());
			System.out.println("Wing Span: " + finch.getWingSpan());
		}
		catch(InvalidCoordinateException e)
		{
			System.out.println(e.getMessage());
		}
		catch(InvalidSimIDException e)
		{
			System.out.println(e.getMessage());
		}
		catch(InvalidWingspanException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("*********************************************");
		
		//Test walk
		System.out.println("Current Location: x = " + arr[0] + ", y = " + arr[1]);
		gold.walk(3);
		location = gold.getLocation();
		arr = location.getCoordinates();
		System.out.println("Location: x = " + arr[0] + ", y = " + arr[1]);
		System.out.println();
		
		//Test Failed Walk
		try
		{
			location.update(0, 0);
			gold.walk(-3);
			location = gold.getLocation();
			arr = location.getCoordinates();
			System.out.println("Location: x = " + arr[0] + ", y = " + arr[1]);
		}
		catch(InvalidCoordinateException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("*********************************************");
		
		//Test Fly
		try
		{
			System.out.println("current Location: x = " + arr[0] + ", y = " + arr[1]);
			location = new Location(9,10);
			gold.fly(location);
			location = gold.getLocation();
			arr = location.getCoordinates();
			System.out.println("After flying to Location: x = " + arr[0] + ", y = " + arr[1]);
		}
		catch(InvalidCoordinateException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		
		//Failed Test Fly
		try
		{
			System.out.println("current Location: x = " + arr[0] + ", y = " + arr[1]);
			location = new Location(0, -1);
			gold.fly(location);
			location = gold.getLocation();
			arr = location.getCoordinates();
			System.out.println("flying to Location: x = " + arr[0] + ", y = " + arr[1]);
		}
		catch(InvalidCoordinateException e)
		{
			System.out.println(e.getMessage());
		}
		
		//BrownBear Tests
		System.out.println("*********************************************");
		System.out.println("BrownBear Tests");
		System.out.println("*********************************************");
		
		//Empty Constructor
		BrownBear brown = new BrownBear();
		System.out.println("Sim ID: " + brown.getSimID());
		Location loc = brown.getLocation();
		int[] ar =  loc.getCoordinates();
		System.out.println("Location: x = " + ar[0] + ", y = " + ar[1]);
		System.out.println("Full: " + brown.getFull());
		System.out.println("Rested: " + brown.getRested());
		System.out.println("Sub Species: " + brown.getSubSpecies());
		
		System.out.println("*********************************************");
		
		//Test Passed Parameter Constructor
		try
		{
			Location locate = new Location(5, 13);
			int [] anArray = locate.getCoordinates();
			BrownBear bear = new BrownBear(3, locate, "Grizzly");
			System.out.println("Sim ID: " + bear.getSimID());
			System.out.println("Location: x = " + anArray[0] + ", y = " + anArray[1]);
			System.out.println("Full: " + bear.getFull());
			System.out.println("Rested: " + bear.getRested());
			System.out.println("Sub Species: " + bear.getSubSpecies());
		}
		catch(InvalidCoordinateException e)
		{
			System.out.println(e.getMessage());
		}
		catch(InvalidSimIDException e)
		{
			System.out.println(e.getMessage());
		}
		catch(InvalidSubspeciesException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("*********************************************");
		
		//InvalidCoordinateException
		try
		{
			Location locate = new Location(-5, 13);
			int [] anArray = locate.getCoordinates();
			BrownBear bear = new BrownBear(3, locate, "Grizzly");
			System.out.println("Sim ID: " + bear.getSimID());
			System.out.println("Location: x = " + anArray[0] + ", y = " + anArray[1]);
			System.out.println("Full: " + bear.getFull());
			System.out.println("Rested: " + bear.getRested());
			System.out.println("Sub Species: " + bear.getSubSpecies());
		}
		catch(InvalidCoordinateException e)
		{
			System.out.println(e.getMessage());
		}
		catch(InvalidSimIDException e)
		{
			System.out.println(e.getMessage());
		}
		catch(InvalidSubspeciesException e)
		{
			System.out.println(e.getMessage());
		}
		//InvalidSimIDException
		try
		{
			Location locate = new Location(5, 13);
			int [] anArray = locate.getCoordinates();
			BrownBear bear = new BrownBear(-3, locate, "Grizzly");
			System.out.println("Sim ID: " + bear.getSimID());
			System.out.println("Location: x = " + anArray[0] + ", y = " + anArray[1]);
			System.out.println("Full: " + bear.getFull());
			System.out.println("Rested: " + bear.getRested());
			System.out.println("Sub Species: " + bear.getSubSpecies());
		}
		catch(InvalidCoordinateException e)
		{
			System.out.println(e.getMessage());
		}
		catch(InvalidSimIDException e)
		{
			System.out.println(e.getMessage());
		}
		catch(InvalidSubspeciesException e)
		{
			System.out.println(e.getMessage());
		}
		//InvalidSubspeciesException
		try
		{
			Location locate = new Location(5, 13);
			int [] anArray = locate.getCoordinates();
			BrownBear bear = new BrownBear(3, locate, "Polar");
			System.out.println("Sim ID: " + bear.getSimID());
			System.out.println("Location: x = " + anArray[0] + ", y = " + anArray[1]);
			System.out.println("Full: " + bear.getFull());
			System.out.println("Rested: " + bear.getRested());
			System.out.println("Sub Species: " + bear.getSubSpecies());
		}
		catch(InvalidCoordinateException e)
		{
			System.out.println(e.getMessage());
		}
		catch(InvalidSimIDException e)
		{
			System.out.println(e.getMessage());
		}
		catch(InvalidSubspeciesException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("*********************************************");
		
		//Test walk
		System.out.println("Current Location: x = " + ar[0] + ", y = " + ar[1]);
		brown.walk(5);
		loc = brown.getLocation();
		ar = loc.getCoordinates();
		System.out.println("Location: x = " + ar[0] + ", y = " + ar[1]);
		System.out.println();
		
		//Test Failed Walk
		try
		{
			loc.update(0, 0);
			brown.walk(-5);
			loc = brown.getLocation();
			ar = loc.getCoordinates();
			System.out.println("Location: x = " + ar[0] + ", y = " + ar[1]);
		}
		catch(InvalidCoordinateException e)
		{
			System.out.println(e.getMessage());
		}
				
				
		System.out.println("*********************************************");
		
		//Test Swim
		System.out.println("Current Location: x = " + ar[0] + ", y = " + ar[1]);
		brown.swim(10);
		loc = brown.getLocation();
		ar = loc.getCoordinates();
		System.out.println("Location: x = " + ar[0] + ", y = " + ar[1]);
		System.out.println();
		
		//Test Failed Swim
		try
		{
			loc.update(0, 0);
			brown.swim(-15);
			loc = brown.getLocation();
			ar = loc.getCoordinates();
			System.out.println("Location: x = " + ar[0] + ", y = " + ar[1]);
		}
		catch(InvalidCoordinateException e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}
