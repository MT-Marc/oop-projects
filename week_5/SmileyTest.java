package PRK_5;

public class SmileyTest {

	public static void main(String[] args) {
		Smiley s1 = new Smiley("blue", "yellow", "happy");
		s1.saveSVG("smiley1");
		Smiley s2 = new Smiley("green", "red", "sad");
		s2.saveSVG("smiley2");
	}
}
