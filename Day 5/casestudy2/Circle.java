package casestudy2;

import java.util.Scanner;

public class Circle extends Shape {
	public double radius;
	
	//	Getters
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	
	//	Setters
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//	toString
	@Override
	public String toString() {
		Shape s = new Shape();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter color : ");
		s.color = sc.next();
		if(s.color != null)
			s.filled = true;
		sc.close();
		return "Circle["+s+",radius="+this.radius+"]";
	}

}
