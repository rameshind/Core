package com.ekaplus.logicalprograms;

public class FibWithConditions {

	/**
	 * @param args

	 */
	
	static final String[] s=new String[2];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		
 		printSeries(10);
		
	}
static void	printSeries(int n){
	int f3,f1=0,f2=1;
	boolean flag=true; 
	int count=0;
	if(n<0){
		System.out.println("Please enter Positive number range");
		return;
	}
	System.out.print(" " +f1);
	System.out.print(" "+f2);
	for(int i=0;i<=n;i++){
	f3=f1+f2;
	flag=true;
	//if(f3%2!=0)
		//System.out.println(f3);
	if(f3%2==0&&flag){
		flag=false;
		System.out.print (" #");
	}
	if(f3%2!=0||(f3%2==0&&flag)){
		System.out.print(" "+f3);
		//flag=true;
	}
	
	/*if(f3%2==0&&flag){
		System.out.print(" " +f3);
		flag=true;
	}
	*/
	f1=f2; 
	f2=f3;
	}
	
	
	
	
	
}

}
