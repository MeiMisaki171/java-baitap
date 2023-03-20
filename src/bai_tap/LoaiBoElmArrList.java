package bai_tap;
import java.util.ArrayList;
import java.util.Scanner;
public class LoaiBoElmArrList {

	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap vao so phan tu");
		int n = scanner.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println("Nhap vao phan tu thu "+i);
			arrList.add(scanner.next());
		}
		
		System.out.println("Array List ban dau:");
		for(String e : arrList) {
			System.out.print(e+ "\t");
		}
		
		ArrayList<String> arrTemp = new ArrayList<>();
		System.out.println("\nArray List sau khi xoa phan tu trung nhau:");
		for (String e: arrList) {
			if (!arrTemp.contains(e)) {
				arrTemp.add(e);
			}
		}
		arrList.clear();
		arrList.addAll(arrTemp);
		for(String e : arrList) {
			System.out.print(e+"\t");
		}
	}

}
