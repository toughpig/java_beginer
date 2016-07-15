package ObjectOriented;


public class Generic_Demo <T,H>{
	private T t; 
	void setT(T t){
		this.t=t;
	}
	T getT(){
		return t;
	}
	public H tell(H h,T t){
		System.out.println(getT()+"hello");
		return h;
	
	};
	
		
	

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Generic_Demo  gd=new Generic_Demo();
		gd.setT("ÄãºÃ£º");
		System.out.println(gd.tell("hello  ÄãºÃ",gd.getT()));
		
		// TODO Auto-generated method stub

	}

}
