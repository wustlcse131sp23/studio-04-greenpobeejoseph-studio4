package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.rectangle(.5, .5, .4, .2);
		
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(.5, .5, .4, .2);

		StdDraw.setPenColor(Color.red);

		StdDraw.filledRectangle(.5, .5, .15, .2);
		
		StdDraw.setPenColor(Color.white);
		StdDraw.filledCircle(0.5, 0.5, 0.05);
		

		
		
		
		
	}
}