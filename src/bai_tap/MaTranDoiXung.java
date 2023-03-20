package bai_tap;
import java.util.Scanner;
public class MaTranDoiXung {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m, n, kt=0;
		
		do {
			System.out.println("Nhap vao so dong m:");
			m=scanner.nextInt();
			System.out.println("Nhap vao so cot n:");
			n=scanner.nextInt();
		} while (m<1 || n<1 || m>5 || n>5);
		
		//Nhap mang
		int A[][] = new int [m][n];
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.println("Nhap vao phan tu A["+i+"]["+j+"]");
				A[i][j]= scanner.nextInt();
			}
		}
		
		//Xuat mang
		System.out.println("Mang da nhap vao la:");
		for (int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(A[i][j]+" ");
			}
			System.out.println("");
		}
		
		//Kiem tra ma tran doi xung
		if(m==n) { //Kiem tra ma tran vuong
			for (int i=0; i<m; i++) {
				for (int j=0; j<i; j++) {
					if (A[i][j] == A[j][i]) {
		                kt = 1;
		            } else {
		                kt = 0;
		            }
				}
			}
            if (kt == 1) {
		        System.out.println("Ma trận vừa nhập là ma trận đối xứng");
		    } else {
		        System.out.println("Ma trận vừa nhập là ma trận không đối xứng");
		    }
		} else {
			System.out.println("Day khong phai ma tran doi xung");
		}
	}

}
