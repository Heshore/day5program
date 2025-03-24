package Day5;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Writer;
import java.util.*;
public class Ex3 {
public static void main(String[] args) {
	try {
		FileWriter writer = new FileWriter("example.txt");
		writer.write("Hello all");
		writer.close();
		System.out.print("Data successfully written to file.");
	}
	catch (IOException e) {
		System.out.println("Error reading the file:"+e.getMessage());
	}
	}
	}


