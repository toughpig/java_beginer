package ExceptionDemo;

//�쳣�������
//ԭ����ʹ��if�����ܹ������Error��RuntimeException
//Error��RuntimeException���������쳣��ϵͳֱ���׳�
//��ʽ�쳣ֻ������ȷ�����ķ����в��п��ܱ��׳�

public class TryCatchTest {

	//Throwable ��ΪError and Exception
	//Exception��ΪRuntimeException�ͼ���쳣
	//��ָ�룬�����±�Խ�磬����ת���������쳣
	int test(){
		int result=100;
		int divider=10;
		try{
		while(divider>-5){  //-1 -5���һ������Ϊ0ʱ�Ѿ�ִֹͣ��
		result+=100/divider;//һ���׳��쳣��GUI��������ִֹͣ��
		divider--;
		}
	}catch(Exception e){
		System.out.println("Exception exists!");
	}
		return result;
		
	}
	
	
	public static void main(String[] args) {
		//�������ʹ��
		System.out.println(new TryCatchTest().test());
		//TryCatchTest tct=new TryCatchTest();
		//int result=tct.test();
		//System.out.println(result);
		// TODO Auto-generated method stub

	}

}
