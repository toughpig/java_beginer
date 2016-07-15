package ObjectOriented;
import java.util.Arrays;

public class Arrays_Foreach{
	int array[]=new int[4];
	public Arrays_Foreach(int a,int b,int c,int d){
		this.array[0]=a;
		this.array[1]=b;
		this.array[2]=c;
		this.array[3]=d;
		
	}
	
	
	

	public static void main(String[] args) {
		Arrays_Foreach af=new Arrays_Foreach(3,2,5,1);
		for(int arrays:af.array){
	    	System.out.println(arrays);
	    }
		Arrays.sort(af.array);
		System.out.println(Arrays.toString(af.array));
	    for(int arrays:af.array){
	    	System.out.println(arrays);
	    }
		
		// TODO Auto-generated method stub

	}

}
