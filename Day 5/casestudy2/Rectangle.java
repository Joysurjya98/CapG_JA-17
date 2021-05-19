package casestudy2;

import java.util.Scanner;

public class Rectangle extends Shape {
	public double width;
	public double length;
	
	//	Getters
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}
	public double getArea() {
		return width*length;
	}
	public double getPerimeter() {
		return 2*(width+length);
	}
	
	//	Setters
	public void setWidth(double width) {
		this.width = width;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	//	toString
	@Override
	public String toString() {
		Shape s = new Shape();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter color: ");
		s.color = sc.next();
		if(s.color != null)
			s.filled = true;
		sc.close();
		return "Rectangle["+s+",widh="+this.width+",length="+this.length+"]";
	}

}
