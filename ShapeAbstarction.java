/**
 * @author Atul 15103075
 */

package Atul;

abstract class ShapeAbstarction {

	abstract void numofSides();
	
}
class Trapezoid extends ShapeAbstarction
{
	void numofSides()
	{
		System.out.println("Number of Sides of Trapezoid = 4");
	}
}

class Triangle extends ShapeAbstarction
{
	void numofSides()
	{
		System.out.println("Number of Sides of Triangle = 3");
	}
}

class Hexagon extends ShapeAbstarction
{
	void numofSides()
	{
		System.out.println("Number of Sides of Hexagon = 6");
	}
	
}

