package com.eka.mislinious;

public class NextGreatestNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[] result=computeNGE(new int[]{13,7,6,12});
for(int i:result){
	System.out.print(" "+i);
}

System.out.println(" Zero size : "+new int[0].length);
	}

	
	private static int[] computeNGE(int[] tocompute) {
	    if (tocompute == null) {
	        throw new NullPointerException();
	    }
	    if (tocompute.length == 0) {
	        return new int[0];
	    }
	    if (tocompute.length == 1) {
	        return new int[]{-1};
	    }
	    int[] indices = new int[tocompute.length];
	    int[] nge = new int[tocompute.length];
	    nge[tocompute.length - 1] = -1;
	    indices[tocompute.length - 1] = -1;
	    for (int i = tocompute.length - 2; i >= 0; i--) {
	        int j = i + 1;
	        while (j != -1 && tocompute[j] <= tocompute[i]) {
	            j = indices[j];
	        }
	        indices[i] = j;
	        nge[i] = j == -1 ? -1 : tocompute[j];
	    }
	    return nge;
	}
}
