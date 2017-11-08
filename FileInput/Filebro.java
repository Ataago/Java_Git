import java.io.*;

class Filebro {
	public static void main(String Args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char c;
		int i;
		//File ataa = new File("E:\\Java_Git\\FileInput\\createdFiles\\bhaisab.txt");
		FileOutputStream fo = new FileOutputStream(Args[0]/*ataa,false*/);
		System.out.println("q to exit");
		do{
			c = (char)br.read();
			if(c != 'q')
				fo.write(c);
		}while(c != 'q');
		fo.close();

		System.out.println("Display");
		FileInputStream fi = new FileInputStream(Args[0]);
		do{
			i = fi.read();
			if(i != -1)
				System.out.print((char)i);
		}while(i!=-1);
		fi.close();
	}
}