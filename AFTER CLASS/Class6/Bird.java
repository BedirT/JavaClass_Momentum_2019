public class Bird extends Animal implements Birds{
	
	public Bird(int age, int weightInLbs, String gender) {
		super(age, weightInLbs, gender);
	}

	public void speak() {
		System.out.println("I am a bird...");
	}
	
	public void fly() {
		System.out.println("I am flying...");
	}
	
}