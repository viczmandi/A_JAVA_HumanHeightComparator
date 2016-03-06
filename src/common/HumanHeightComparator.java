package common;
import java.util.Comparator;

public class HumanHeightComparator implements Comparator<Human>{

	@Override
	public int compare(Human o1, Human o2) {
		if (o1.getHeight() > o2.getHeight()) {
			return 1;
		} else if (o1.getHeight() == o2.getHeight()) {
			return 0;
		}else{			
			return -1;
		}
	}

}
