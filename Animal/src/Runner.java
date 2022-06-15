
public class Runner {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		
		animal.sleep();
		animal.eat();
		
		//using getters and setters
		Animal tiger = new Animal("Big cat", 4, true);
		tiger.setWarmBlooded(false);
		
		//not ideal way to print all details
		System.out.println(tiger.getLegs());
		System.out.println(tiger.getSpecies());
		System.out.println(tiger.isWarmBlooded());
		
		System.out.println(tiger);
	}

}
