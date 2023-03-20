package bai_tap;
import java.util.Scanner;
public class MaTranThua {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m,n,soPhanTu,soPhanTuKhong=0,soPhanTuConLai;
		
		do {
			System.out.println("Nhap vao so dong m:");
			m = scanner.nextInt();
			System.out.println("Nhap vao so cot n:");
			n = scanner.nextInt();
		} while (m<1 || n<1);
		
		int A[][] = new int[m][n];
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.println("Nhap vao phan tu A["+i+"]["+j+"]");
				A[i][j]=scanner.nextInt();
			}
		}
		
		soPhanTu=m*n;
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if (A[i][j]==0) {
					soPhanTuKhong +=1;
				}
			}
		}
		soPhanTuConLai = soPhanTu - soPhanTuKhong;
		if(soPhanTuConLai >= soPhanTuKhong) {
			System.out.println("Day khong phai la mang thua");
		} else {
			System.out.println("Day la mang thua");
		}
	}

}
