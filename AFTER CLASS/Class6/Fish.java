
public class Fish extends Animal implements Fishes{
	
	public Fish(int age, int weightInLbs, String gender) {
		super(age, weightInLbs, gender);
	}

	public void swim(){
		System.out.println("Swimming...");
	}
	
	public void speak() {
		System.out.println("Blablabla..");
	}
	
}
