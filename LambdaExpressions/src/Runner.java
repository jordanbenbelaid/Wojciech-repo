import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		
		ArrayList<String> animals = new ArrayList<>();	

		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Hyena");
		animals.add("Elephant");
		
		//'n' is the variable, we can call this whatever we want
		//the arrow function shows its a lambda expression
		//expression body comes last after the arrow
		animals.forEach(n -> System.out.println(n));
		
		//Using logic with the lambda expression
		animals.forEach(n -> {if(n.contains("e")) System.out.println(n);});
		
		//Another way to write the above expression
		animals.forEach(n -> {
			if(n.contains("e")) 
				System.out.println(n);
			});
	}

}
