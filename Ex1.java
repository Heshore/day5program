package Day5;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class Ex1 {
public static void main(String[] args) {
	try {
		FileWriter w1 =new FileWriter("./example.txt");
		w1.write("Hii sam");
		w1.close();
		System.out.println("Data written to file.");
		FileReader r1 =new FileReader("./example.txt");
		int character;
		while ((character= r1.read()) != -1) {
			System.out.print((char) character);
			
		}
		r1.close();
	} 
	catch (IOException e) {
		
		System.out.println("An error occurrred:" +e.getMessage());
	}
}
}


