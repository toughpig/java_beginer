package ExceptionDemo;



import java.awt.TextField;
import java.util.Scanner;
//键盘输入String input=new Scanner(System.in).next()

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
		//抛出异常测试
		ShortTextField stf=new ShortTextField();
		Scanner input=new Scanner(System.in);
	/*  stf.setText(input.next());
		System.out.println(stf.getshorttext());  */
	
		
		//捕获异常测试
		//try{可能产生异常的代码块}
		//catch(ExceptionType e){处理此异常的代码块}
		//catch(OtherException oe){处理此异常的代码块}
		
		try{
			stf.setText(input.next());
		    System.out.println(stf.getshorttext());
		    input.close();
		}catch(SpaceLack e){
			System.out.println("message is too long");
			
		}
			
		
		
		
		
		
	}


}
