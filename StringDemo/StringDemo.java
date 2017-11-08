import java.io.*;
class StringDemo{
	public static String middle(String str){
		if((str.length() % 2) == 0){
			if(str.length()>2)
				return str.substring(str.length()/2 - 1, str.length()/2 +1);
			else{
				return str;
			}
		}	
		else
			return str.substring(str.length()/2, str.length()/2+1);
	}
	public static void palindrome(String str){
		String rev = "";
		for(int i = (str.length()-1); i>=0; i--)
			rev = rev + str.charAt(i);
		if(str.equals(rev))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
	public static void vowel(String str){
		int v=0;
		for( int i= 0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if(ch=='U' ||ch=='u' ||ch=='o' ||ch=='O' ||ch=='I' ||ch=='i' ||ch=='E' ||ch=='e' ||ch=='A' ||ch=='a')
				v++;
		}
		System.out.println("Number of vowels: "+v );
	}
	public static void count(String str){
		int c=0;
		for( int i= 0; i<str.length(); i++)
		{
			if(str.charAt(i) != ' ')
				c++;
		}
		System.out.println("Number of chars: "+c );
	}
	public static void main(String Args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter string");
		String str = br.readLine();  //= scan.next();
		System.out.println("Middle : "+middle(str));
		palindrome(str);
		vowel(str);
		count(str);
	}
}