package entities;

public class Circle extends Shape {
	private Double radius;
	public final Double PI = 3.14;
	
	public Circle() {
	}

	public Circle(Double radius, String color) {
		this.radius = radius;
		this.setColor(color);
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	@Override
	public Double area() {
		return PI * radius * radius;
	}
	
	
}
