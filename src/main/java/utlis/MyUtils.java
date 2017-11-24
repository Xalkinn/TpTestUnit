package utlis;

import java.util.ArrayList;
import java.util.List;

public class MyUtils {

	private static final int List = 0;

	public static void main(String[] args) {

	}

	public static int sum (List<Integer>list) {
		if (list == null) {
			return 0;
		}
		int sum = 0;
		for (Integer i : list) {
			if (i != null) {
				sum += i;
			}
		}
		return sum;
	}

	public static String emptyToNull(String s) {
		if (s!=null && s.isEmpty()) 
			return s;
		
		return null;

	}

	public static List<Integer> filterEvenNumbers(List<Integer> integers) {

		List<Integer> listv2 = new ArrayList<Integer> ();
		if(integers != null) {
			for (int i = 0; integers.size() > i; i++) {
				if (integers.get(i) != null && integers.get(i) % 2 == 0) {
					listv2.add(integers.get(i));
				}
			}
		}
		return listv2;
	}		

	public static List<Float> transformSquarePlusPointFive(List<Integer> integers) {
		List<Float> listv2 = new ArrayList<Float>();
		float val;
		for (int i = 0; integers.size() > i; i++) {
			val = (float)(integers.get(i));
			listv2.add(val*val + 0.5F);
		}
		return listv2;
	}
}
