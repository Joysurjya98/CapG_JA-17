package casestudy2;

import java.util.Scanner;

public class Main {
	
	static void circleDetails() {
		Scanner sc = new Scanner(System.in);
		Circle circle = new Circle();
		System.out.print("Enter radius of the circle: ");
		circle.radius = sc.nextDouble();
		System.out.println(circle);
		System.out.printf("Area of the circle : %.2f square units\n",circle.getArea());
		System.out.printf("Perimeter of the circle : %.2f units\n",circle.getPerimeter());
		sc.close();

	}

	static void rectangleDetails() {
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		System.out.print("Enter width of the rectangle: ");
		rectangle.width = sc.nextDouble();
		System.out.print("Enter length of the rectangle: ");
		rectangle.length = sc.nextDouble();
		System.out.println(rectangle);
		System.out.printf("Area of the rectangle : %.2f square units\n", rectangle.getArea());
		System.out.printf("Perimeter of the rectangle : %.2f units\n", rectangle.getPerimeter());
		sc.close();

	}
	
	static void squareDetails() {
		Scanner sc = new Scanner(System.in);
		Square square = new Square();
		System.out.print("Enter side of the square: ");
		square.length = sc.nextDouble();
		System.out.println(square);
		System.out.printf("Area of the square : %.2f square units\n", square.getArea());
		System.out.printf("Perimeter of the square : %.2f units\n", square.getPerimeter());
		sc.close();
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice: \n1. Circle Details \n2. Rectangle Details \n3. Square Details \n");
        int ch = sc.nextInt();
        if (ch == 1)
            circleDetails();
        else if (ch == 2)
            rectangleDetails();
        else if (ch == 3)
            squareDetails();
        else
            System.out.println("Please enter a valid input!");
        sc.close();

	}

}
