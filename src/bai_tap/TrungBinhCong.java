package bai_tap;

import java.util.Scanner;
import java.text.DecimalFormat;

public class TrungBinhCong {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		int sum = 0;
		float soTBC;
		System.out.println("Nhap vao so nguyen n: ");
		int n = scanner.nextInt();
		for (int i=1; i< n+1 ; i++) {
			System.out.println("Nhap vao so thu " + i +" : ");
			int m = scanner.nextInt();
			sum += m;
		}
		soTBC = (float) sum/n;
		System.out.println("Trung binh cong cua " + n + " so da nhap la: " + decimalFormat.format(soTBC));
	}
}
