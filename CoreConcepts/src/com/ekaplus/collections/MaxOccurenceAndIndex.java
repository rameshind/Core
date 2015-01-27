package com.ekaplus.collections;

import java.util.Comparator;

public class MaxOccurenceAndIndex implements Comparator<MaxOccurenceAndIndex> {
	private Integer index;
	private Integer occurence;
	private Character chr;

	public Character getChr() {
		return chr;
	}

	public void setChr(Character chr) {
		this.chr = chr;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public Integer getOccurence() {
		return occurence;
	}

	public void setOccurence(Integer occurence) {
		this.occurence = occurence;
	}

	public int compare(MaxOccurenceAndIndex o1, MaxOccurenceAndIndex o2) {
		// TODO Auto-generated method stub
		if(o1.getOccurence()>o2.getOccurence())
		return 1;
		else if (o1.getOccurence().equals(o2.getOccurence()))
			return 0;
		else
			return -1;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{Occurnce:"+this.occurence+" Charecter:"+this.getChr()+" Index:"+this.getIndex()+"}";
	}

}
