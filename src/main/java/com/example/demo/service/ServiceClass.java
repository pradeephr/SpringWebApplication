package com.example.demo.service;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.SampleObj;

@Service
public class ServiceClass {
	Hashtable<String,SampleObj> res= new Hashtable<String,SampleObj>();
	public ServiceClass(){
		SampleObj s= new SampleObj();
		s.setAddress("dummy address 1");
		s.setName("pradeep");
		SampleObj s1= new SampleObj();
		s1.setAddress("dummy address 2");
		s1.setName("pradeepRavi");
		res.put("p1",s);
		res.put("p2",s1);
	}
	public SampleObj getObj(String id){
		return res.get(id);
	}
	public List<SampleObj> getAll(){
		return new ArrayList<SampleObj>(res.values());
	}
}
