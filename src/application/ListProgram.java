package application;

import java.util.ArrayList;
import java.util.List;

public class ListProgram {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("João");
		list.add("José");
		list.add("Renata");
		list.add("Claudio");
		
		for(String name : list) {
			System.out.println(name);
		}
		
	}

}
