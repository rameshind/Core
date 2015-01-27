package hclprograms;

import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConutingLettersInWord {

	
	public static void main(String[] args) {
		Scanner sc =new Scanner(new InputStreamReader(System.in));
		System.out.print("Enter String to count : ");
		String source=sc.next();
		Map<Character,Integer> charCount=new HashMap<Character, Integer>();
		for(int i=0;i<source.length();i++){
			if(charCount.containsKey(source.charAt(i))){
				charCount.put(source.charAt(i), charCount.get(source.charAt(i))+1);
			}else{
				charCount.put(source.charAt(i), 1);
			}
		}
		
		System.out.println(charCount);

	}

}
