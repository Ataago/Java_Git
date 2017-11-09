import java.util.Scanner;
abstract class Solid {
	double r;
	Scanner scan = new Scanner(System.in);
	
	public abstract void SA();
	public abstract void V();
	public void R()
	{
		System.out.print("Enter Radius: ");
		r = scan.nextDouble();
	}
	public double CA(double r)
	{
		double ca = Math.PI * r * r;
		return ca;
	}
}