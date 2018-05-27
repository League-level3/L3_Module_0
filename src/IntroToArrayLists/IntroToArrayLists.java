package IntroToArrayLists;

import java.util.ArrayList;

public class IntroToArrayLists {

	public static void main(String[] args) {
		String a = "a";
		String b = "b";
		String c = "c";
		String d = "d";
		String e = "e";
		// 1. Create an array list of Strings
		ArrayList<String> strings = new ArrayList<String>();
		// Don't forget to import the ArrayList class

		// 2. Add five Strings to your list
		strings.add(a);
		strings.add(b);
		strings.add(c);
		strings.add(d);
		strings.add(e);
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < 5; i++) {
			System.out.println(strings.get(i));

		}

		// 4. Print all the Strings using a for-each loop
		for (String i : strings) {
			System.out.println(i);

		}
		// 5. Print only the even numbered elements in the list.
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				System.out.println(strings.get(i));

			}
		} // 6. Print all the Strings in reverse order.
		for (int i = 4; i >= 0; i--) {
			System.out.println(strings.get(i));

		}
		// 7. Print only the Strings that have the letter 'e' in them.
	System.out.println(e);
	
	}	
}
