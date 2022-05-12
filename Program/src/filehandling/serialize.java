package filehandling;
import java.io.*;
public class serialize {
	
		public static void main(String[] args) {
		
		Employee e=new Employee(23,"ibrahim");
		try {
		FileOutputStream fileOut=new FileOutputStream("D:\\c program\\New folder");
		ObjectOutputStream fileout=new ObjectOutputStream(fileOut);
				fileout.writeObject(e);
				fileout.close();
				fileOut.close();
				System.out.println("serialized data is saved in/tmp/employee.ser");
		}catch(IOException i)
		{
			i.printStackTrace();
		}
		}
	}


