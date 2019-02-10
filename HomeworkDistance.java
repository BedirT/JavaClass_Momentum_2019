// 2nd Class Homework

public class HomeworkDistance {

	public static void main(String[] args) {
		
		// 1 - Write a class that calculates the distance between two points
		// 2 - Write a class that calculates the area of triangle from 3 given points.
		// 3 - Edit the code below so that coordinates are taken as input from the user.
		// 4 - Print out "Success!" if the distance between 3rd and 2nd coordinates is larger than
		//		2nd and 1st coordinates.
		
		double x1 = 3.5;
		double y1 = 2.8;
		double x2 = -3.5;
		double y2 = -2.8;
		double x3 = 2.1;
		double y3 = -3.9;
		
		System.out.println("Distance between point 1 and point 3 is: " + computeDistance(x1,y1,x3,y3));
		System.out.println("Distance between point 2 and point 3 is: " + computeDistance(x3,y3,x2,y2));
		System.out.println("Distance between point 1 and point 2 is: " + computeDistance(x1,y1,x2,y2));
		System.out.println("Area of the triangle produced from these point is: " + computeTriangleArea(x1, y1, x2, y2, x3, y3));

		
		
	}

}
