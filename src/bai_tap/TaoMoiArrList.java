package bai_tap;
import java.util.ArrayList;
import java.util.Scanner;
public class TaoMoiArrList {

	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap so phan tu cua arrList: ");
		int n = scanner.nextInt();
		for (int i=0; i<n; i++) {
			System.out.println("Nhap phan tu thu "+i);
			arrList.add(scanner.next());
		}
		System.out.println("Array List ban dau:");
		for (int i=0; i<arrList.size(); i++) {
			System.out.print(arrList.get(i)+"\t");
		}
		
		ArrayList<String> newArrList = new ArrayList<>();
		for (String e: arrList) {
			if(!newArrList.contains(e)) {
				newArrList.add(e);
			}
		}
		
		System.out.println("\nArray List moi:");
		for (int i=0; i<newArrList.size(); i++) {
			System.out.print(newArrList.get(i)+"\t");
		}
	}

}
