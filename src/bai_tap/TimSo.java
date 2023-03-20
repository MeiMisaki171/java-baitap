package bai_tap;

import java.util.Scanner;

public class TimSo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m=0, sum = 0, n; 
		
		do {
			System.out.println("Nhap so n: ");
			n = scanner.nextInt();
		} while (0 > n);
		
		while((sum+m)< n) {
			sum += ++m;
			System.out.print(m);
			if((sum+m)<n) {
				System.out.print(" + ");
			}
		}
		if (sum > m) {
		System.out.println(" = " + sum + " <= " + n);
		}
		System.out.println("So m thoa ma la: " + m);
	}
}
