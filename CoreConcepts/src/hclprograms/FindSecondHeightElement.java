package hclprograms;

public class FindSecondHeightElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     secondLargest(new int[]{10,4,56,4562,2,3421});
	}

	static void secondLargest(int[] arr) {
		int l = arr[0];
		int sl = arr[1];
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (l < arr[i]) {
				sl = l;
				l = arr[i];
			}
			else if(sl<arr[i])
				sl=arr[i];
		}
		System.out.println(" Secong "+sl);
	}
	

}
