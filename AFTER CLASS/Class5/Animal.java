
public class Animal {

	// age, weightInLbs, gender
	private int age;
	private int weightInLbs;
	private String gender;

	// constructor w parameters
	public Animal (int age, int weightInLbs, String gender) {
		this.age = age;
		this.weightInLbs = weightInLbs;
		this.gender = gender;
	}

	// eat, sleep ?
	public void eat() {
		System.out.println("Eating...");
	}

	public void sleep() {
		System.out.println("Sleeping...");
	}

	public void speak() {
		System.out.println("Age: " + age);
		System.out.println("Weight: " + weightInLbs + " lbs");
		System.out.println("Gender: " + gender);
	}

}
