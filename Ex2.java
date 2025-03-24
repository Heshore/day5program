package Day5;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;
public class Ex2 {
	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("example.txt");
			PrintStream r1;
			int character;
		System.out.println("File contents:");
		while ((character = reader.read()) != -1) {
			System.out.print((char) character);
		}
		reader.close();
		}
		catch (IOException e) {
	System.out.println("Error reading the file:"+e.getMessage());
		}
	}
	
}

