import java.io.FileNotFoundException;
import java.util.Scanner;

class StringRecurWithNoDuplidate {
	static StringBuilder a;
	static int n;

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		// System.setIn(new FileInputStream("input4.txt"));
		Scanner in = new Scanner(System.in);
		a = new StringBuilder(in.next());
		n = a.length();
		recurse(0);

	}

	static void recurse(int i) {
		if (i == n - 1)
			System.out.println(a);
		int j;
		for (j = i; j <= n - 1; j++) {
			// the trick is here, if the character to be swapped are same, then
			// just dont swap them
			if (i != j && a.charAt(i) == a.charAt(j))
				continue;
			swap(i, j);
			recurse(i + 1);
			swap(j, i);
		}
	}

	static void swap(int i, int j) {
		char temp = a.charAt(i);
		a.setCharAt(i, a.charAt(j));
		a.setCharAt(j, temp);
	}
}