import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		
		//Making a new list
		List<String> fish = new ArrayList<String>();
		List<String> nums = new ArrayList<String>();
		List<String> chars = new ArrayList<String>();
		
		
		System.out.println(fish.size());
		
		//adding to the list "fish"
		fish.add("Goldfish");
		fish.add("Cod");
		fish.add("Salmon");
		fish.addAll(chars);
		
		System.out.println(fish.size());
		
		//for loop through an arraylist
		for (int i = 0; i < fish.size() ; i++) {
			System.out.println(fish.get(i));
		}
		
		//enhanced for loop through an arraylist
		for (String s : fish) {
			System.out.println(s);
		}
		
	}

}
