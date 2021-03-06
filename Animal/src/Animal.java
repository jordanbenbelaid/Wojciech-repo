
public class Animal {

	//Attributes
	private String species;
	private int legs;
	private boolean isWarmBlooded;
	
	//Constructor/s
	//constructor with nothing
	public Animal() {	}
	
	//constructor with everything
	public Animal(String species, int legs, boolean isWarmBlooded) {
		super();
		this.species = species;
		this.legs = legs;
		this.isWarmBlooded = isWarmBlooded;
	}
	
	//Getters and setters
	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public boolean isWarmBlooded() {
		return isWarmBlooded;
	}

	public void setWarmBlooded(boolean isWarmBlooded) {
		this.isWarmBlooded = isWarmBlooded;
	}
	
	//ToString
	@Override
	public String toString() {
		return "ANIMAL: \nSpecies: " + species + "\nNumber of legs: " + legs + "\nIs the animal warm blooded?: " + isWarmBlooded;
		// ANIMAL: 
		//Species: Big Cat
		//Number of legs: 4
		//Is the animal warm blooded: true
	}
	
	//random methods
	public void eat() {
		System.out.println("I like food");
	}

	public void sleep() {
		System.out.println("I sleep 3 hours a day");
	}
	
}
