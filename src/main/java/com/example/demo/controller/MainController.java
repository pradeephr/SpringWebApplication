package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.stream.Collectors;

import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.SampleObj;
import com.example.demo.DBConnection.LaptopRepository;
import com.example.demo.model.Laptops;
import com.example.demo.service.ServiceClass;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(value="/laptop",produces="application/json")
@ResponseBody
public class MainController {
	@Autowired
	ServiceClass serviceObj;
	@Autowired
	private LaptopRepository laptopRepository;
	
	@RequestMapping(value="/allDummy",produces="application/json")
	public List<SampleObj> getAll(){
		return serviceObj.getAll();
	}
	
	@RequestMapping("{id}")
	public SampleObj getObj(@PathVariable("id") String id){
		return serviceObj.getObj(id);
	}
	
	@RequestMapping(value="/all",produces="application/json")
	public List<Laptops> getAllLaptops(){
		return Lists.newArrayList(laptopRepository.findAll());
	}
}
