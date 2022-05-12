package oops;

public class Useofthis {
	
		String name;
	 public Useofthis(String name ) {
		 this.name= name;
	 }
	   public void show()
	 {
	  System.out.println(name);
	 }
		 public static void main(String[] args) {
			 Useofthis obj= new Useofthis("hai");
			 obj.show();
			 Useofthis obj2=new Useofthis("welcome to java");
			 obj2.show();
		 }
	 }

