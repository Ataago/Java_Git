import java.io.*;
public class Buff {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Integer a = Integer.parseInt(br.readLine());
		System.out.println(a);
			
		String b = br.readLine();
		System.out.println(b);

		float c = Float.parseFloat(br.readLine());
		System.out.println(c);
	}
}