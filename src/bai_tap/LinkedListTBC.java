package bai_tap;
import java.util.Scanner;
import java.util.LinkedList;
public class LinkedListTBC {

	public static void main(String[] args) {
		int sum=0, count = 0;
		double tbCong = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap vao so phan tu: ");
		int n = scanner.nextInt();
		
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		for (int i=0; i<n; i++) {
			System.out.println("Nhap vao phan tu thu " + i);
			linkedList.add(scanner.nextInt());
		}
		
		for (int i=0; i<n; i++) {
			if(linkedList.get(i)%2==0) {
				sum += linkedList.get(i);
				count++;
			}
		}
		tbCong = (double) sum/count;
		System.out.println("Trung binh cong cac so chan la: "+ tbCong);
	}

}
