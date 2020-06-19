package PRK_5;

public class BoxTest {

	public static void main(String[] args) {
		Box b1 = new Box(3,4,5);
		Box cube = new Box(4);
		
		System.out.println("Surface: " + b1.getSurfaceArea() + " Volume:" + b1.getVolume());
		System.out.println("Surface: " + cube.getSurfaceArea() + " Volume:" + cube.getVolume());
		
		b1.scale(2);
		cube.scale(2);
		
		System.out.println("Surface: " + b1.getSurfaceArea() + " Volume:" + b1.getVolume());
		System.out.println("Surface: " + cube.getSurfaceArea() + " Volume:" + cube.getVolume());
	}
}
