package filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize {
	

		public static void main(String[] args) {
			
			Employee e=null;
			// TODO Auto-generated method stub
			try {
				FileInputStream fileIn=new FileInputStream("D:\\c program\\New folder");
				ObjectInputStream in=new ObjectInputStream(fileIn);
						e=(Employee)in.readObject();
						in.close();
						fileIn.close();
						
				}catch(IOException i)
				{
					i.printStackTrace();
				}catch(ClassNotFoundException c) {
					
					System.out.println("Employee class not found");
					c.printStackTrace();
					return;
				}
			System.out.println("Deserialized Emplyee...");
			System.out.println("name:"+e.getName());
			System.out.println("id:"+e.getId());
				}
			
		}



