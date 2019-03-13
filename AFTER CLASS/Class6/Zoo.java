
public class Zoo {

	public static void main(String[] args) {
		
		// new animal ?
		Animal lion = new Animal(4, 400, "M");
		lion.eat();
		lion.sleep();
		lion.speak();
		
		// what about a new bird class ?
		Bird sparrow = new Bird(6, 10, "F");
		sparrow.fly();
		sparrow.speak();
		sparrow.eat();
		sparrow.sleep();
		
		// and fish ?
		Fish goldfish = new Fish(1, 1, "M");
		goldfish.speak();
		
		// inheritence extends
		
		// What about a sparrow and a penguin classes ?
		
		// Can penguin fly though ?
		
		// overwriting
		
		// better method - interface:
		// abstract methods, "implements"
		
		// interfaces are contracts
		
		// CAN ONLY HAVE ONE PARENT CLASS
		// As many interfaces as wanted
		
		// Polymorphism

	}

}
