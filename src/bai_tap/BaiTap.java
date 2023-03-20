package bai_tap;

import java.util.Scanner;

public class BaiTap {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao so thu nhat: ");
		int soThuNhat = scanner.nextInt();
		System.out.println("Nhap vao so thu hai: ");
		int soThuHai = scanner.nextInt();
		
		while ((soThuNhat < 0) || (soThuHai < 0)) {
			System.out.println("So nhap vao khong dung, hay nhap lai");
			System.out.println("Nhap vao so thu nhat: ");
			soThuNhat = scanner.nextInt();
			System.out.println("Nhap vao so thu hai: ");
			soThuHai = scanner.nextInt();
		}
		
		int temp1 = soThuNhat;
		int temp2 = soThuHai;
		while (temp1 != temp2) {
			if (temp1 > temp2) {
				temp1 = temp1-temp2;
			} else {
				temp2 = temp2 -temp1;
			}
		}
		int ucln = temp1;
		
		System.out.println("Uoc chung lon nhat cua 2 so " + soThuNhat + " va " + soThuHai + " la: " + ucln);
	}
}
