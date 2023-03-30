package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {

	private double w;
	private double l;

	/**
	 * Constructor
	 * @param length
	 * @param width
	 */
	public Rectangle(double length, double width)
	{
		this.l = length;
		this.w = width;
	}

	/**
	 * 
	 * @return perimeter
	 */
	public double perimeter()
	{
		double p = 2* this.l + 2*this.w;
		return p;
	}
 
	/**
	 * 
	 * @return area of rectangle
	 */
	public double area()
	{
		double area= this.l*this.w;
		return area;
	}
	
	/**
	 * 
	 * @param Rectangle rect
	 * @return if rectangle is smaller than imported one
	 */
	public boolean isSmaller(Rectangle rect)
	{
		boolean small = false;
		if(rect.area() > this.area())
		{
			small = true;
		}
		return small;
	}
	
	/**
	 * 
	 * @return if rectangle is a square
	 */
	public boolean isSquare()
	{
		boolean square = false;
		if(this.l == this.w)
		{
			square = true;
		}
		return square;
	}
	
	/**
	 * Draws a rectangle
	 */
	public void drawRectangle()
	{
		StdDraw.filledRectangle(0, 0, l/2, w/2);
	}
 
	

	/**
	 * 
	 * @param args 
	 */
	public static void main(String[] args)
	{
		Rectangle rect = new Rectangle(2.0, 3.0);
		System.out.println("Perimeter: " + rect.perimeter());
		System.out.println("Area: " + rect.area());
		System.out.println("Is smaller? " + rect.isSmaller(new Rectangle(3.0, 3.0)));
		System.out.println("Is square: " + rect.isSquare());
		rect.drawRectangle();
	
	}

}
