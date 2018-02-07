import java.io.*;
public class CreateFile {
	public static void main(String Args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char c;
		int i;
		
		File no_name = new File("E:\\Java_Git\\BufferedReader_Demo");
		
		FileOutputStream fout = new FileOutputStream(no_name);
		System.out.print("Enter q to exit: ");
		do
		{
			c = (char)br.read();
			if(c != 'q')
				fout.write(c);
		}while(c != 'q');
		fout.close();
		
		FileInputStream fin = new FileInputStream(no_name);
		System.out.println("Display");
		do
		{
			i = fin.read();
			if(i != -1)
				System.out.print((char)i);
		}while(i != -1);
		fin.close();
	}
}