package ObjectOriented;

public class Diversity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Star lin=new SuperStar();
		SuperStar wade=new SuperStar();
		HallOfFlame jordan=new HallOfFlame();
		//SuperStar kobe=new Star();��������ò���ָ����
		lin.ability();
		wade.ability();
		jordan.ability();
		
		//������������ת��
		SuperStar rose=new SuperStar();
		Star drick=rose;
		Star jimmy=new Star();
		boolean roseissuperstar=(drick instanceof SuperStar);
		boolean roseisjuststar=(drick instanceof Star);
		boolean jimmysucks=(jimmy instanceof SuperStar);
		System.out.println(roseissuperstar);
		System.out.println(roseisjuststar);
		System.out.println(jimmysucks);

	}

}
