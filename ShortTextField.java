package ExceptionDemo;



import java.awt.TextField;
import java.util.Scanner;
//��������String input=new Scanner(System.in).next()

@SuppressWarnings("serial")
public class ShortTextField extends TextField {
	
	private final static int max=10;
	public String getshorttext() throws SpaceLack{
		if(getText().length()<max){
			return getText();
		}else{
			throw new SpaceLack();
		}
	}

	public static void main(String[] args) throws SpaceLack{
		//�׳��쳣����
		ShortTextField stf=new ShortTextField();
		Scanner input=new Scanner(System.in);
	/*  stf.setText(input.next());
		System.out.println(stf.getshorttext());  */
	
		
		//�����쳣����
		//try{���ܲ����쳣�Ĵ����}
		//catch(ExceptionType e){������쳣�Ĵ����}
		//catch(OtherException oe){������쳣�Ĵ����}
		
		try{
			stf.setText(input.next());
		    System.out.println(stf.getshorttext());
		    input.close();
		}catch(SpaceLack e){
			System.out.println("message is too long");
			
		}
			
		
		
		
		
		
	}


}
