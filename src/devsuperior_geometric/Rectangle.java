package devsuperior_geometric;

public class Rectangle {
	
	private double width;
	private double height;
	
	//MÉTODOS ESPECIAIS (ACESSORES E MODIFICADORES)
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setWidth(double width) {
		this.width = width; 
	}
	
	public void setHeight(double height) {
		this.height = height;
	}

	//DEMAIS MÉTODOS
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return 2 * (width + height);
	}
	
	public double diagonal() {
		return Math.sqrt((width * width) + (height * height));
	}

	@Override
	public String toString() {
		return "Rectangle [width= " + width + ", height= " + height + "]";
	}
	
}
