package college;
import java.io.*;

public class FileHandling {
	public static void main(String [] args){
		try {
			int a[]={11,12,8,9};
		OutputStream os=new FileOutputStream("test.txt");
		for(int i=0;i<a.length;i++){
			os.write(a[i]);
		}
		os.close();
		
		InputStream is=new FileInputStream("test.txt");
		int size=is.available();
		for(int i=0;i<size;i++){
			System.out.println(is.read()+ " ");
		}
		is.close();
	}catch(IOException e){
		System.out.println("Exception");
	}
}
}

