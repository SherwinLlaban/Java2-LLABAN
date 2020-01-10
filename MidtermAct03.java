import java.io.*;
import java.util.*;

public class MidtermAct03
{
	public static void main(String[] args){
		try {
			File Act03 = new File("phonebook.txt");
			Scanner scanner = new Scanner(Act03);
			String data = "";

			while (scanner.hasNext()){
				data = scanner.next();
				if(data.equals("1001-11")){
					System.out.println("Code: " +data);
					System.out.print("First Name: "+scanner.next());
					System.out.print("Last Name: "+scanner.next());
					System.out.print("CP No.: "+scanner.next());
					continue;
				}
			}
			scanner.close();
		} 
		catch (IOException e){
			System.out.println("Error!");
		}
	}
}