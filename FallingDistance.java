/* Falling Distance
	Calculate distance, in meters, an object has traveled when dropped.
	Calculate distance when dropped for 1 seconds to 10 seconds.
*/

public class FallingDistance
{
	public static void main(String[]args)
	{
		System.out.println("Seconds\t\tMeters");
		System.out.println("------------------------------");

		for(int i=0; i<10; i++)
		{
			double time = fallingDistance(i);
		}

	}

	public static double fallingDistance(double fallingTime)
	{
		double distance = 0.0;
		double g = 9.81;
		double seconds = fallingTime;

		distance=fallingTime*fallingTime;
		distance=distance*g;
		distance=distance*.5;
		System.out.println(+seconds+"\t\t"+distance);

		return distance;

	}
}


