import java.util.Scanner;
public class DemoFib {
	public static void main(String Args[]) {
		Scanner scan = new Scanner(System.in);
		Fibo f = new Fibo();
		
		System.out.print("Enter the Number of Elements of Fibonacci: ");
		int n = scan.nextInt();
		
		int res_RecFib= 0, res_NonrecFib = 0;
		
		System.out.print("Series with Recursive Function: ");
		for(int i=0; i<n; i++)
		{
			res_RecFib = f.RecFib(i);
			System.out.print(res_RecFib+" ");
		}
		System.out.println("\nnth Element ="+res_RecFib);
		
		System.out.print("Series with Non Recursive Function: ");
		res_NonrecFib = f.NonrecFib(n);
		System.out.println("\nnth Element ="+res_NonrecFib);
	}
}