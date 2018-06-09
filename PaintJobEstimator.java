import java.util.Scanner;

public class PaintJobEstimator
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many rooms need to be painted? ");
		double rooms = keyboard.nextDouble();
		//System.out.print("Square feet of wall space in each room? ");
		//double squareFeet = keyboard.nextDouble();
		System.out.print("Price of paint per gallon? $");
		double pricePerGallon = keyboard.nextDouble();

		double paint = gallonsOfPaint(rooms);
		System.out.println(paint+" gallons");

		double hours = hoursOfLabor(paint);
		System.out.println(hours+" hours");

		double priceOfPaint = costOfPaint(paint, pricePerGallon);
		System.out.println("$"+priceOfPaint);

		double laborCharges = laborCosts(hours);
		System.out.println("Labor Costs: $"+laborCharges);

		double totalCharges = totalCosts(priceOfPaint, laborCharges);
		System.out.println("Total Costs: $"+totalCharges);


	}

	public static double gallonsOfPaint(double numRooms) //num1 = rooms, num2 = squareFeet
	{
		Scanner keyboard = new Scanner(System.in);
		double squareFeet = 0.0;
		for(int i = 0; i<numRooms; i++)
		{
			System.out.print("Enter square feet for room "+(i+1)+": ");
			squareFeet =+ keyboard.nextDouble();
		}
		squareFeet = squareFeet/115;
		return squareFeet;
	}

	public static double hoursOfLabor(double num1)
	{
		double totalHours;									//intializes totalHours
		totalHours = num1;								//every 115 sq ft of paint=8 hour
		totalHours = totalHours*8;							//hours
		return totalHours;
	}

	public static double costOfPaint(double num1, double num2)
	{
		double totalPaintCosts;
		totalPaintCosts = num1*num2;//gets amount of gallons needed			//gallons*price of paint
		return totalPaintCosts;
	}

	public static double laborCosts(double num1)
	{
		double laborCharges;
		laborCharges = num1*18;
		return laborCharges;
	}

	public static double totalCosts(double num1, double num2)
	{
		double totalCharges;
		totalCharges = num1+num2;
		return totalCharges;
	}
}