package myProject;

import java.util.ArrayList;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		list.forEach(index -> {
			if(index%2 != 0) System.out.println(list.get(index - 1));
		});
		
	}

}
