package bai_tap;
import java.util.Scanner;
public class TongHaiMaTran {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m, n;
		System.out.println("Nhap so dong m:");
		m = scanner.nextInt();
		System.out.println("Nhap so cot n:");
		n = scanner.nextInt();
		
		int A[][]= new int[m][n];
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				System.out.println("Nhap phan tu A["+i+"]["+j+"]");
				A[i][j] = scanner.nextInt();			
				}
		}
		int B[][]=new int[m][n];
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.println("Nhap vao phan tu B["+i+"]["+j+"]");
				B[i][j] = scanner.nextInt();
			}
		}
		int mangTong[][] = new int [m][n];
		for (int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				mangTong[i][j]=A[i][j]+B[i][j];
			}
		}
		System.out.println("Mang tong cua 2 mang la:");
		for (int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(mangTong[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
