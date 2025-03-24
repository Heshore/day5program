package Day5;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Ex5 {
public static void main(String[] args) {
	try {
		BufferedWriter writer = new BufferedWriter(new FileWriter("c:\\test\\sample.txt"));
		writer. write("Java file handling eaxmple.");
		writer.newLine();
		writer. write("BufferedWriter makes writing more efficient.");
		writer.close();
		System.out.println("Data written to file successfully.");
	}
	catch (IOException e) {
		System.out.println("Error writing the file:"+e.getMessage());
	}
}
}
