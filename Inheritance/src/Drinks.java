
public class Drinks {

	private int amount;
	private double cost;
	private String name;
	
	public Drinks() {}
		
	public Drinks(int amount, double cost, String name) {
		super();
		this.amount = amount;
		this.cost = cost;
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Drinks [amount=" + amount + ", cost=" + cost + ", name=" + name + "]";
	}
	
	public void drink() {
		System.out.println("This drink is nice");
	}
	
}
