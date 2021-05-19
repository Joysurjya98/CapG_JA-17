package casestudy2;

public class Square extends Rectangle {
	
	//	Getters
	public double getSide() {
		return length;
	}
	
	//	Setters
	public void setSide(double length) {
		this.length = length;
	}
	public void setWidth(double length) {
		this.length = length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	@Override
	public double getArea() {
		return length*length;
	}
	@Override
	public double getPerimeter() {
		return 4*length;
	}
	
	//	toString
	@Override
	public String toString() {
		Rectangle r = new Rectangle();	
		return "Square["+r+"]";
	}

}
