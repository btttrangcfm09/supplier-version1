package com.boostmytool.model;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;

public class SupplierDto {
	@NotEmpty(message = "The name is required")
	private String name;
	
	@Size(min = 10, message = "The address should be at lease 10 chareacters")
	@Size(max = 2000, message = "The address cannot exceed 2000 characters")	
	private String address;
	
	@Size(min = 10, message = "The description should be at least 10 characters")
	@Size(max = 2000, message = "The description cannot exceed 2000 characters")
	private String description;
	
	private MultipartFile imageLogo;

	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public MultipartFile getImageLogo() {
		return imageLogo;
	}

	public void setImageLogo(MultipartFile imageLogo) {
		this.imageLogo = imageLogo;
	}
	
}
