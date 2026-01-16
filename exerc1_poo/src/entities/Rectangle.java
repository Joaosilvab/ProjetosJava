package entities;

public class Rectangle {
	
	public double width;
	public double heigth;
	
	public double area() {
		return width * heigth;
	}
	
	public double perimeter() {
		return (width + heigth) * 2;
	}

	public double diagonal() {
		return Math.sqrt((width * width) + (heigth * heigth));
	}
	
	public String toString() {
		return "Area = "
			+ String.format("%.2f%n", area())
			+ "Perimeter = "
			+ String.format("%.2f%n", perimeter())
			+ "Diagonal = "
			+ String.format("%.2f%n", diagonal()); 
	}
}
