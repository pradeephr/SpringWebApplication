package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptops {
	@Id
	private  Long itemId;
	private String laptopBrand;
	private String modelNo;
	private String laptopImg;
	private Integer price;
	private Integer ram;
	private String processor;
	private Float screenSize;
	
	
	public Long getItemId() {
		return itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public String getLaptopBrand() {
		return laptopBrand;
	}
	public void setLaptopBrand(String laptopBrand) {
		this.laptopBrand = laptopBrand;
	}
	public String getModelNo() {
		return modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	public String getLaptopImg() {
		return laptopImg;
	}
	public void setLaptopImg(String laptopImg) {
		this.laptopImg = laptopImg;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getRam() {
		return ram;
	}
	public void setRam(Integer ram) {
		this.ram = ram;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public Float getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(Float screenSize) {
		this.screenSize = screenSize;
	}
	
}
