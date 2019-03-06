public class Circle {
	
	private int cx, cy; // private variable for center
	private int r; 	// private variable for radius
	private String name;

	public Circle(){
		cx = 0;
		cy = 0;
		r = 1;
		name = "Default";
	}
	
	public Circle(int r){
		cx = cy = 0;
		this.r = r;
		name = "Default";
	}
	
	public Circle(int r, String name){
		cx = cy = 0;
		this.r = r;
		this.name = name;
	}
	
	public Circle(int r, String name, int x, int y){
		cx = x;
		cy = y;
		this.r = r;
		this.name = name;
	}
	
	public void setCenter(int x, int y){
		this.cx = x;
		this.cy = y;
	}
	
	public int getCenterX() {
		return cx;
	}
	
	public int getCenterY() {
		return cy;
	}
	
	public void setRadius(int x){
		this.r = x;
	}
	
	public double getRadius(){
		return r;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPerimeter(){
		return 2*r*Math.PI;
	}
	
	public double getArea(){
		return Math.PI*r*r;
	}
	
	public boolean isInside(int x, int y){
		int dist1 = cx - x;
		int dist2 = cy - y;
		return r >= Math.sqrt(dist1*dist1 + dist2*dist2);
	}

	public void speak() {
		System.out.println("I am round");
		System.out.println("My name is " + name + ".");
		System.out.println("My radius is " + r + ".");
		System.out.println("My center is (" + cx + "," + cy + ").");
	}

}