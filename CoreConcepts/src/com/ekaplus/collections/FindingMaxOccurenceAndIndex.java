package com.ekaplus.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class FindingMaxOccurenceAndIndex {

	public static void main(String[] args) {
		MaxOccurenceAndIndex andIndex1 = new MaxOccurenceAndIndex();
		MaxOccurenceAndIndex andIndex2 = new MaxOccurenceAndIndex();
		MaxOccurenceAndIndex andIndex3 = new MaxOccurenceAndIndex();
		MaxOccurenceAndIndex andIndex4 = new MaxOccurenceAndIndex();
		andIndex1.setOccurence(3);
		andIndex2.setOccurence(6);
		andIndex3.setOccurence(1);
		andIndex4.setOccurence(78);

		andIndex1.setChr('c');
		andIndex2.setChr('f');
		andIndex3.setChr('b');
		andIndex4.setChr('a');

		andIndex1.setIndex(2);
		andIndex2.setIndex(5);
		andIndex3.setIndex(22);
		andIndex4.setIndex(13);

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(andIndex1.getOccurence(), andIndex1.toString());
		map.put(andIndex2.getOccurence(), andIndex2.toString());
		map.put(andIndex3.getOccurence(), andIndex3.toString());
		map.put(andIndex4.getOccurence(), andIndex4.toString());
		/*
		 * Set<MaxOccurenceAndIndex> set=new TreeSet<MaxOccurenceAndIndex>(new
		 * MaxOccurenceAndIndex()); set.add(andIndex1); set.add(andIndex2);
		 * set.add(andIndex3); set.add(andIndex4); System.out.println(set);
		 */
		// Map<Integer,MaxOccurenceAndIndex> map=new TreeMap<Integer,
		// MaxOccurenceAndIndex>(new FindingMaxOccurenceAndIndex());

		SortedMap<Integer, String> treeMap = new TreeMap<Integer, String>(
				new Comparator<Integer>() {

					public int compare(Integer o1, Integer o2) {
						return o2.compareTo(o1);
					}

				});

		treeMap.putAll(map);
		//System.out.println(treeMap);
		//System.out.println(treeMap.get(treeMap.firstKey()));
		System.out.println(findOccurence("kkaaa"));

		System.out.println(sortByComparator(findOccurence("kkaaabbbbbbl")));

	}
	static SortedMap findOccurence(String input) {
		SortedMap<Character, MaxOccurenceAndIndex> map = new TreeMap<Character, MaxOccurenceAndIndex>();

		for (int i = 0; input.length() > i; i++) {
			if (!map.containsKey(input.charAt(i))) {
				MaxOccurenceAndIndex andIndex = new MaxOccurenceAndIndex();
				andIndex.setChr(input.charAt(i));
				andIndex.setOccurence(1);
				andIndex.setIndex(i);
				map.put(input.charAt(i), andIndex);
			} else {
				MaxOccurenceAndIndex andIndex = (MaxOccurenceAndIndex) map
						.get(input.charAt(i));
				andIndex.setOccurence(andIndex.getOccurence() + 1);
				map.put(input.charAt(i), andIndex);
			}

		}

		return map;
	}

	static Map<Integer, MaxOccurenceAndIndex> sortByComparator(
			Map<Character, MaxOccurenceAndIndex> unsortMap) {

		// Convert Map to List
		List<Map.Entry<Character, MaxOccurenceAndIndex>> list = new LinkedList<Map.Entry<Character, MaxOccurenceAndIndex>>(
				unsortMap.entrySet());

		// Sort list with comparator, to compare the Map values
		Collections.sort(list,
				new Comparator<Map.Entry<Character, MaxOccurenceAndIndex>>() {
					public int compare(
							Map.Entry<Character, MaxOccurenceAndIndex> o1,
							Map.Entry<Character, MaxOccurenceAndIndex> o2) {
						return (o1.getValue().getOccurence()).compareTo(o2
								.getValue().getOccurence());
					}

				});

		Map<Integer, MaxOccurenceAndIndex> sortedMap = new LinkedHashMap<Integer, MaxOccurenceAndIndex>();
		for (Iterator<Entry<Character, MaxOccurenceAndIndex>> it = list.iterator(); it
				.hasNext();) {
			Entry<Character, MaxOccurenceAndIndex> entry = it.next();
			sortedMap.put(entry.getValue().getOccurence(), entry.getValue());
		}
		return sortedMap;
		
	}

}
