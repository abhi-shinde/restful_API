package com.restful.webservice;

import java.util.ArrayList;
import java.util.List;

public class restRepo {
	List<TORest> restlist;
	public restRepo(){
		restlist = new ArrayList<TORest>();
		
		TORest r1 = new TORest();
		r1.setName("abhi");
		r1.setCount(1);
		
		TORest r2 =new TORest();
		r2.setName("shinde");
		r2.setCount(2);		
		
		restlist.add(r1);
		restlist.add(r2);
	}
	public List<TORest> get(){
		System.out.println("repo get called");
		for(TORest t:restlist) {
			System.out.println(t.getName());
		}
		return restlist;
	}
	public void create(TORest t1) {
		System.out.println("added");
		restlist.add(t1);
	}
}
