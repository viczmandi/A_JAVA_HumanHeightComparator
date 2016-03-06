package common;

import java.util.ArrayList;
import java.util.List;

public class HumanHandler {

	public static void main(String[] args) {
			
		List<Human> human = new ArrayList<Human>();
		
		Human human1 = new Human(20, "Name One", 1.6);
		Human human2 = new Human(21, "Name Two", 1.8);
		Human human3 = new Human(22, "Name Three", 2.0);
		Human human4 = new Human(24, "Name Four", 1.8);
		Human human5 = new Human(21, "Name Five", 1.9);
		
		human.add(human1);
		human.add(human2);
		human.add(human3);
		human.add(human4);
		human.add(human5);
		
		//System.out.println(human.toString());
		
		for (int i = 0; i < human.size()-1; i++) {
			HumanHeightComparator h = new HumanHeightComparator();
			System.out.println(h.compare(human.get(i), human.get(i+1)));
		}
		
		human.sort(new HumanHeightComparator());
		System.out.println(human);
	}
		
}
