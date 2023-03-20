package bai_tap;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Collections;
public class LinkedListDaoNguocSo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao so phan tu: ");
		int n = scanner.nextInt();
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		for (int i=0; i<n; i++) {
			System.out.println("Nhap vao phan tu thu "+i);
			linkedList.add(scanner.nextInt());
		}
		
		System.out.println("Danh sach ban dau:");
		for (int i=0; i<n; i++) {
			System.out.print(linkedList.get(i)+"\t");
		}
		
		System.out.println("\nDanh sach dao nguoc:");
		Collections.reverse(linkedList);
		for (int i=0; i<n; i++) {
			System.out.print(linkedList.get(i)+"\t");
		}
	}

}
