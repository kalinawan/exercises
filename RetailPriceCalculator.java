import java.util.Scanner;

public class RetailPriceCalculator
{
	public static void main(String[]args)
	{
		double retailPrice;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter item's wholesale cost: $");
		double wholesale = keyboard.nextInt();
		System.out.print("Enter item's markup percentage: %");
		double markup = keyboard.nextInt();

		retailPrice = calculateRetail(wholesale, markup);
		System.out.println(retailPrice);


	}

	public static double calculateRetail(double num1,double num2)
	{
		double result;
		num2 = num2/100;
		num2 = num2*num1;
		result = num1 + num2;
		return result;
	}
}