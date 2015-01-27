import java.util.ArrayList;
import java.util.Scanner;

public class longestIncreasing1s {

	public static void main(String aa[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		String s1="abc4";
		String s2="abc"+s1.length();
		String s3="abc".concat("4").intern();
		
		System.out.println(s1.hashCode()+" "+s2.hashCode()+" "+s3.hashCode());
		System.out.println(s1==s2);
		System.out.println(s1==s3);
	/*	int maxcount = 0;
		int current = 0;
		int position = 0;
		int check = 0;
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		int i = 1;
		while (i < n) {
			if (a[i] == 0 && a[i - 1] == 1) {
				check = 1;
				position = i;

			} else if (a[i] == 1 && a[i - 1] == 0) {
				position = i;
			}

		}*/
	}
}
