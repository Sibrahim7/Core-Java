package array;



	class ib{
		ib(){
			
		}

	     ib(int number1,int number2){
	   	System.out.println(number1-number2);
	    	 
	     }
	     void run() {
	    	 System.out.println("hii");
	     }
	     }
	class mi extends ib {
		mi(){
			
		}
		mi(int b,int c){
			System.out.println(b+c);
		}
		void run2() {
			System.out.println("hello");
		}
		} 
	class si extends mi{
		
	}
	class inheritence{
	     public static void main(String[] args) {
		System.out.println("temporiry out of service");
	 

	    si s=new si();
	    mi s1=new mi(2,6);
	    ib s2=new ib(2,4);
	    s.run();
	    s.run2();
	    
	}	
	}	
