package bai_tap;

import java.util.List;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.ListIterator;

import java.util.Scanner;

public class XuLyList {

	public static void main(String[] args) {
		List<String> listString = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		
		listString.add("Monday");
		listString.add("Tuesday");
		listString.add("Wednesday");
		listString.add("Thurday");
		listString.add("Friday");
		listString.add("Saturday");
		listString.add("Sunday");
		
		Iterator<String> iterator = listString.iterator();
		
		
		System.out.println("Cac phan thu cua mang: ");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		ListIterator<String> listIterator = listString.listIterator();
		System.out.println("Cach 2: ");
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		System.out.println("Hien thi List tu duoi len");
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
		System.out.println("Nhap phan tu moi");
		String element = scanner.next();
		System.out.println("nhap vao vi tri can thay doi");
		int index = scanner.nextInt();
		listString.set(index, element);
		System.out.println("Mang sau khi thay doi:");
		for (String e : listString) {
			System.out.println(e);
		}
		
		listString.remove(2);
		System.out.println("List sau khi thay doi");
		for (String e : listString) {
			System.out.println(e);
		}
		
		
	}

}
