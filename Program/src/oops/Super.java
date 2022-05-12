package oops;


	class a{
		int number;
		a(){
		System.out.println("eregreg");
		}
		a(int x,int j){
			super();
			System.out.println("nlhhfk");
		}
	}
	class b extends a{
		b(){
			System.out.println("fdesv");
		}
	    void bi(int x ,int b){
		     number= x * b;
			System.out.println("bsbkjbkjdbk");
			System.out.println(number);
		}
		
	}



	public class Super {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	      b we=new b();
	      we.bi(4,4);
		}

	}

