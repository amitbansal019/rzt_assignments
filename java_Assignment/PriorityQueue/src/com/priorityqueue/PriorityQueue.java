package com.priorityqueue;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class PriorityQueue extends AbstractCollection<Object>{
	List<Object> list=new ArrayList<Object>();
	String name;
	int priority;

	@Override
	public Iterator<Object> iterator() {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}


	public void add(PriorityQueue abd) {
		// TODO Auto-generated method stub
		list.add(abd);
		
	}

}
