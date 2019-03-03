public class Circle {
	
	private int cx, cy; // private variable for center
	private int r; 	// private variable for radius
	private String name;

	public Circle(){

	}
	
	public Circle(int x){

	}
	
	public Circle(int x, String n){

	}
	
	public Circle(int r, String n, int x, int y){

	}
	
	public void setCenter(int x, int y){

	}
	
	public void setRadius(int x){

	}
	
	public double getRadius(){

	}
	
	// Set & Get for all private vars
	
	public double getPerimeter(){
		
	}
	
	public double getArea(){

	}
	
	public boolean isInside(int x, int y){

	}

	
	public void speak() {
		System.out.println("I am round");
		System.out.println("My name is " + name + ".");
		System.out.println("My radius is " + r + ".");
		System.out.println("My center is (" + cx + "," + cy + ").");
	}

}