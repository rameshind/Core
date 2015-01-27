package com.rammi;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Rammi {

	public static void main(String[] args) {
		
		Set<Integer> source = new LinkedHashSet<Integer>();
		Set<Integer> destination = new LinkedHashSet<Integer>();
		Rammi rammi = new Rammi();
		Scanner sc = new Scanner(System.in);
		System.out
		.print("Enter the size that you to create array : " );
		source = rammi.createSouce(source, sc.nextInt());
		System.out.println("Before Source : " + source);
		System.out.println("Before Source Size : " + source.size());
		 
		do {
			

			System.out.println("Before Destination : " + destination);
			System.out.println("Before Destination Size : "
					+ destination.size());
			System.out
			.print("\n\nEnter the no that you want to remove from 1 to "
					+ source.size()+" : ");
			destination = rammi.deleteValue(source, destination, sc.nextInt());
			System.out.println("\n\nAfter Source : " + source);
			System.out.println("After Source Size : " + source.size());

			System.out.println("After Destination : " + destination);
			System.out
					.println("After Destination Size : " + destination.size());
			System.out.print("\nEnter 'Y' to continue :");
		} while (sc.next().equalsIgnoreCase("Y"));
	}

	Set<Integer> createSouce(Set<Integer> source, Integer length) {
		Random random = new Random();
		int min = 0;
		int max = length;
		for (int i = 0; i <= length * 5; i++) {
			source.add(random.nextInt(max - min) + min + 1);
			if (source.size() == length)
				break;

		}
		
		return source;

	}

	Set<Integer> deleteValue(Set<Integer> source, Set<Integer> destination,
			Integer value) {
		if (source.contains(value)) {
			destination.add(value);
			source.remove(value);
		}

		return destination;
	}
}
