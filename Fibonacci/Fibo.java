public class Fibo {
	public int RecFib(int n) {
		if(n<=1)
			return n;
		return (RecFib(n-2) + RecFib(n-1));
	}
	public int NonrecFib(int n) {
		int a=0, b=1, c=0;
		if(n == 1)
		{
			System.out.print(a);
			return a;
		}
		if(n == 2)
		{
			System.out.print(a+" "+b);
			return b;
		}
		System.out.print(a+" "+b);
		for(int i = 2; i<n; i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a = b;
			b = c;
		}
		return c;
	}
}