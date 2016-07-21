package io;
import java.io.*;

public class InandOut {

	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("pic.png");
			FileOutputStream fos=new FileOutputStream("pic_new.png");
			byte input[]=new byte[10];
			while(fis.read(input)!= -1){
				fos.write(input);
			}
			fis.close();
			fos.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub

	}

}
