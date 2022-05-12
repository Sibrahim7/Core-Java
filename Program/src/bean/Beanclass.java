package bean;


	public class Beanclass implements Comparable{
			
			String color;
	     
			public Beanclass(String color,String brand,double price) {
			  this.color=color;
	         this.brand=brand;
	          this.price=price;
		}
		public String getColor() {
			return color;
		}
	     public String getBrand() {
			return brand;
		}
	     public double getPrice() {
	 		return price;
	 	}
	     String Color;
	     String brand;
	     double price;
		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			return 0;
		}
	}

