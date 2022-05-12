package bean;


	import java.util.ArrayList;
	import java.util.Collections;

	public class MainCollection {

		public static void main(String[] args) {
			
			Beanclass bean=new Beanclass("red","ZARA",1200);
		Beanclass bean1=new Beanclass("black","arrow",1234.23);
			Beanclass bean2=new Beanclass("blue","guess",79595);
	    
			 ArrayList<Beanclass> al=new ArrayList<Beanclass>();
			al.add(bean);
			al.add(bean1);
			al.add(bean2);
		   Collections.sort(al);
			for(Beanclass obj : al)
			{
				System.out.println("brand::"+obj.getBrand());
				System.out.println("price::"+obj.getPrice());
				System.out.println("color::"+obj.getColor());
				System.out.println(""+obj);
			}
			
	}
	}

