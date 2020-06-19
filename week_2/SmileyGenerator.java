import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SmileyGenerator {
	
	public static void main(String[] args) {
		PrintWriter writer = null;
		File file = new File("index.html");
		try {
			writer = new PrintWriter("index.html");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// variables
		String header = "<!DOCTYPE html> \n <html> \n <body> \n <svg height='1000' width='1000'>";
		String footer = "\n </svg>\n </body> \n </html>";
		String circle = "<circle cx='250' cy='250' r='200' stroke='black' stroke-width='6' fill='red'/>";
		String eyeL = "<circle cx='200' cy='200' r='75' stroke='black' stroke-width='6' fill='white'/>";
		String eyeR = "<circle cx='400' cy='200' r='75' stroke='black' stroke-width='6' fill='white'/>";
		String pupilL = "<circle cx='220' cy='200' r='25' stroke='brown' stroke-width='6' fill='black'/>";
		String pupilR = "<circle cx='420' cy='200' r='25' stroke='brown' stroke-width='6' fill='black'/>";
		String bow = "<path d='M 200 350 q 100,80 200,0' />";
		
		// output
		
		writer.println(header);
		writer.println(circle);
		writer.println(eyeL);
		writer.println(eyeR);
		writer.println(pupilL);
		writer.println(pupilR);
		writer.println(bow);
		writer.println(footer);
		
		writer.close();
		}
	}
