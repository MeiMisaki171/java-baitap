package bai_tap;
import java.util.Scanner;
public class SapXepMang {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int max = 100, temp;
		int arr[] = new int[max];
		int  n;
		
		do {
			System.out.println("Nhap vao so phan tu cua mang:");
			n = scanner.nextInt();
		} while (n<=2 || n> max-1 );
		System.out.println("Nhap gia tri cho cac phan tu cua mang:");
		for (int i= 0; i <n; i++) {
			System.out.println("A[" + i + "] = ");
			arr[i] = scanner.nextInt();
		}
		System.out.print("Mang ban dau la: ");
		for (int i = 0; i<n; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.print("\nMang sau khi sap xep: ");
		for (int i=0; i<n-1; i++) {
			for (int j=i+1; j<=n-1; j++) {
				if (arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (int i=0; i <n ; i++) {
		System.out.print(arr[i] +" ");
		}
	}
}
