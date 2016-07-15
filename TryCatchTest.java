package ExceptionDemo;

//异常处理机制
//原则是使用if尽可能规避所有Error和RuntimeException
//Error和RuntimeException属于隐含异常，系统直接抛出
//显式异常只有在明确声明的方法中才有可能被抛出

public class TryCatchTest {

	//Throwable 分为Error and Exception
	//Exception分为RuntimeException和检查异常
	//空指针，数组下标越界，类型转换，算数异常
	int test(){
		int result=100;
		int divider=10;
		try{
		while(divider>-5){  //-1 -5结果一样，因为0时已经停止执行
		result+=100/divider;//一旦抛出异常非GUI程序立即停止执行
		divider--;
		}
	}catch(Exception e){
		System.out.println("Exception exists!");
	}
		return result;
		
	}
	
	
	public static void main(String[] args) {
		//匿名类的使用
		System.out.println(new TryCatchTest().test());
		//TryCatchTest tct=new TryCatchTest();
		//int result=tct.test();
		//System.out.println(result);
		// TODO Auto-generated method stub

	}

}
