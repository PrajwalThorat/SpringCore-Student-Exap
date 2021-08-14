package org.stackroute.standlone.collection;

import java.util.List;
import java.util.Map;

public class Person {
	private List<String> friends;
	private Map<String, Integer> feeStructure;

	
	public List<String> getFrinds() {
		return friends;
	}

	public void setFrinds(List<String> frinds) {
		this.friends = frinds;
	}

	public Map<String, Integer> getFeeStructure() {
		return feeStructure;
	}

	public void setFeeStructure(Map<String, Integer> feeStructure) {
		this.feeStructure = feeStructure;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feeStructure=" + feeStructure + "]";
	}
	
	
	
}
