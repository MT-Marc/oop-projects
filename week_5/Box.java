package PRK_5;

public class Box {

	private int length;
	private int width;
	private int height;
	
	Box(int le, int wi, int he){
		this.length = le;
		this.width = wi;
		this.height = he;
	}
	
	Box(int length){
		this.length = length;
		this.height = length;
		this.width = length;
	}
	
	public void scale(int scaleFactor) {
		this.height *= scaleFactor;
		this.length *= scaleFactor;
		this.width *= scaleFactor;
	}
	
	public int getVolume() {
		return this.length*this.height*this.width;
	}
	
	public int getSurfaceArea() {
		int a = this.height;
		int b = this.length;
		int c = this.width;
		return (2*a*b)+(2*a*c)+(2*b*c);
	}
	
	public boolean isCube() {
		if(this.length == this.height && this.length == this.width) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Box [length=" + length + ", width=" + width + ", height=" + height + "]";
	}	
}
