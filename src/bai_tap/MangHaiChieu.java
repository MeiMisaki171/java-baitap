package bai_tap;

import java.util.Scanner;

public class MangHaiChieu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int soDong, soCot;
		System.out.println("Nhap vao so dong: ");
		soDong = scanner.nextInt();
		System.out.println("Nhap vao so cot: ");
		soCot = scanner.nextInt();
		
		int A[][] = new int [soDong][soCot];
		
		for (int i=0; i<soDong; i++) {
			for (int j=0; j<soCot; j++){
				System.out.println("Nhap phan tu A["+i+"]["+j+"]");
				A[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Mang da nhap la:");
		for (int i=0; i<soDong; i++) {
			for (int j=0; j<soCot; j++) {
				System.out.print(A[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
