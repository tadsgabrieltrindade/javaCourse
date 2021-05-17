package entities;

import entities.enums.Color;

public abstract class Shape {
	private Color color;
	
	public abstract Double area();

	public Color getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = Color.valueOf(color);
	}
}
