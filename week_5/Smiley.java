package PRK_5;

import java.io.FileWriter;
import java.io.IOException;

public class Smiley {

	private String foregroundColor;
	private String backgroundColor;
	private String mood;
	
	Smiley(String foregroundColor, String backgroundColor, String mood){
		this.backgroundColor = backgroundColor;
		this.foregroundColor = foregroundColor;
		this.mood = mood;
	}
	
	public void saveSVG(String fileName) {
		try {
			FileWriter fr = new FileWriter(fileName+".html");
			if(this.mood.equals("happy")) {
				fr.write("<svg version=\"1.1\" baseProfile=\"full\" xmlns:ev=\"http://www.w3.org/2001/xml-\r\n" + 
						"events\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"\r\n" + 
						"xmlns=\"http://www.w3.org/2000/svg\" preserveAspectRatio=\"xMidYMid meet\"\r\n" + 
						"zoomAndPan=\"magnify\" id=\"MySmiley\" viewBox=\"-21 -21 42 42\"width=\"800\" height=\"800\">"+
						"<circle r=\"20\" stroke=\"black\" stroke-width=\"1\" fill=\""+foregroundColor+"\"/>"+
						"<circle r=\"20\" fill=\"" +backgroundColor+ "\"/>"+
						"<ellipse rx=\"2.5\" ry=\"4\" cx=\"6\" cy=\"-7\" fill=\""+foregroundColor+"\"/>"+
						"<ellipse rx=\"2.5\" ry=\"4\" cx=\"-6\" cy=\"-7\" fill=\""+foregroundColor+"\"/>"+
						"<path fill=\"none\" stroke=\"" +foregroundColor+ "\" stroke-width=\".75\" d=\"M -12,5 A 13.5,13.5,0 0,0 "+
						"12,5 A 13,13,0 0,1 -12,5\"/>"+
						"</svg>");		
			}else if(this.mood.equals("sad")) {
				fr.write("<svg version=\"1.1\" baseProfile=\"full\" xmlns:ev=\"http://www.w3.org/2001/xml-\r\n" + 
						"events\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"\r\n" + 
						"xmlns=\"http://www.w3.org/2000/svg\" preserveAspectRatio=\"xMidYMid meet\"\r\n" + 
						"zoomAndPan=\"magnify\" id=\"MySmiley\" viewBox=\"-21 -21 42 42\"width=\"800\" height=\"800\">"+
						"<circle r=\"20\" stroke=\"black\" stroke-width=\"1\" fill=\""+foregroundColor+"\"/>"+
						"<circle r=\"20\" fill=\"" +backgroundColor+ "\"/>"+
						"<ellipse rx=\"2.5\" ry=\"4\" cx=\"6\" cy=\"-7\" fill=\""+foregroundColor+"\"/>"+
						"<ellipse rx=\"2.5\" ry=\"4\" cx=\"-6\" cy=\"-7\" fill=\""+foregroundColor+"\"/>"+
						"<ellipse rx=\"8\" ry=\"4\" cx=\"0\" cy=\"8\" fill=\""+foregroundColor+"\"/>"+
						"12,5 A 13,13,0 0,1 -12,5\"/>"+
						"</svg>");
			}
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
