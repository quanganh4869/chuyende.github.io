package com.bootsmytool.beststore.models;

import org.springframework.web.multipart.MultipartFile;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.*;

//@Entity
//@Table(name = "products")
public class ProductDto {
	
	@NotEmpty (message = "The name is required")
	private String name;

	@NotEmpty (message = "The brand is required")
	private String brand;

	@NotEmpty (message = "The name is required")
	private String category;

	@Min (0)
	private double price;

	@Size(min = 10, message = "Mô tả không được ít hơn 10 ký tự")
	@Size (max = 2000, message = "Mô tả không được quá 2000 ký tự")
	private String description;

	private MultipartFile imageFile;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public MultipartFile getImageFile() {
		return imageFile;
	}

	public void setImageFile(MultipartFile imageFile) {
		this.imageFile = imageFile;
	}

	
	

}
