package apstract;


	abstract class Shape{
		abstract void area();
		abstract void volume();
		
		void show() {
			
			System.out.println("string message");
		}
		
	}
     class circle extends Shape{
		 void area() {
			 System.out.println("hai");
		 }
		 void volume() {
			 System.out.println("hello");
		 }
	}

	   public class Shapes{	
		   public static void main(String[] args) {
		     circle obj=new circle();
		     obj.area();
		   	
		   	
		   }
	}

