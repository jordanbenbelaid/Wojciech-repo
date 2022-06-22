
public class Beer extends Drinks{
	
	private String taste;
	private boolean isPlastic;
	
	public Beer() {
		super();
	}
	
	public Beer(int amount, double cost, String name, String taste, boolean isPlastic) {
		super(amount, cost, name);
		this.taste = taste;
		this.isPlastic = isPlastic;
	}
	
	@Override
	public String toString() {
		return "Beer [taste=" + taste + ", isPlastic= " + isPlastic + " "+ super.toString() + "]";
	}

	@Override
	public void drink() {
		System.out.println("This drink is amazing");
	}
	
	public void bubbles() {
		System.out.println("VEry bubbly");
	}
	
}
