package oops;

public class Method1 {
		
		String email = "ibrahim";
		
		//taking something, returning something
		
		public String display1(String name)
		{
			String s = "Welcome "+name;
			
			return s;
			
		}
		
		//taking something, returning nothing
		
		static void display2()
		{
			System.out.println("6379074204");
		}
		//taking nothing, returning something
		
		public String display3()
		{
			String em = email+"@gmail.com";
			return em;
		}
		
		//taking nothing, returning nothing
		
		public void display4() {
			System.out.println("My Details::");
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Method1 obj = new Method1();
			obj.display4();
			String s = obj.display1("ibrahim");
			System.out.println(s);
			display2();
			String e = obj.display3();
			System.out.println(e);
			
			
			

		}

	}
