package java1;

import java.util.Scanner;
import java.util.ArrayList;

public class grocerylist {
	private ArrayList list;
	private Scanner scan;

	public grocerylist() {
		list = new ArrayList<String>();
		scan = new Scanner(System.in);
	}

	public void add(int x) {

		{
			System.out.println("What would you like to add to the list fool?: ");
			list.add(scan.next());
		}

	}

	public void remove(int x) {
		for (int i = 1; i <= x; i++) {
			System.out.println("What would you like to remove from the list fool?: ");
			list.remove(scan.next());
		}
	}

	public void sort() {

	}

	public String toString() {
		String print = "";
		for (int i = 1; i <= list.size(); i++) {
			print += i + "." + list.get(i - 1) + "\n";
		}

		return print;
	}

	public static void main(String args[]) {
		grocerylist Kweku = new grocerylist();
		Kweku.add(10);
		Kweku.remove(2);
		System.out.println(Kweku.toString());
	}
}
