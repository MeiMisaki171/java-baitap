package bai_tap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;
public class BaiTapHashSet {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("So luong nhap vao: ");
		int n=scanner.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println("Nhap vao loai trai cay");
			hashSet.add(scanner.next());
		}
		System.out.println("Danh sach trai cay");
		for(String e: hashSet) {
			System.out.print(e+"\t");
		}
		System.out.println("\nSo luong trai cay nhap vao");
		System.out.println(hashSet.size());
		
		System.out.println("Nhap trai cay can tim");
		String traiCayCanTim = scanner.next();
		if(hashSet.contains(traiCayCanTim)) {
			System.out.println("Co trai cay "+traiCayCanTim+" trong danh sach");
		} else {
			System.out.println("Khong co loai can tim");
		}
		
		System.out.println("Nhap trai cay can xoa");
		String xoaTraiCay = scanner.next();
		if(hashSet.contains(xoaTraiCay)) {
			hashSet.remove(xoaTraiCay);
			System.out.println("Danh sach sau khi xoa");
			for(String e: hashSet) {
				System.out.print(e+"\t");
			}
		} else {
			System.out.println("\nKhong co loai trai cay can xoa");
		}
		
		List<String> listTraiCay = new LinkedList<>();
		listTraiCay.add("cam");
		listTraiCay.add("le");
		listTraiCay.add("man");
		hashSet.addAll(listTraiCay);
		Iterator<String> iterator = hashSet.iterator();
		System.out.println("\nDanh sach moi:");
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + "\t");
		}
		
		System.out.println("\nDanh sach sau khi xoa:");
		hashSet.removeAll(listTraiCay);
		for (String e : hashSet) {
			System.out.print(e+"\t");
		}
	}
}
