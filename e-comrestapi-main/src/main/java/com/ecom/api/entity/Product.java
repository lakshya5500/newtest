package com.ecom.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.NoArgsConstructor;
import lombok.ToString;
@NoArgsConstructor
@ToString
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 15, name = "Product_id")
	Integer pid;
	
	@NotEmpty 
	@Size(min = 3,max = 15,message =  "Brand name should have 3 characters")
	@Column(length = 15, name = "Brand") 
	String pbrand;
	
	@NotEmpty
	@Size(min = 3,max = 25,message = "Product name should have 3 characters")
	@Column(length = 25, name = "Product_Name")
	String pname;
	
	@NotEmpty
	@Size(min = 3,max = 100,message = "Product Description should have 3 characters")
	@Column(length = 100, name = "Description")
	String description;
	
	@NotNull 
	@Column(name = "Price")
	double price;
	
	@NotEmpty
	@Size(min = 3,max = 150, message = "image url should must imporatant")
	@Column(length = 150, name = "Image")
	String img;	
	
	@NotNull 
	@Column(length = 3, name = "Rating")
	float rating;
	
	@NotNull 
	@Column(length = 10, name = "Total_Amount")
	double total;
	
	@NotNull 
	@Column(length = 3, name = "Qty")
	Integer quantity;

	@OneToOne
	@NotNull
	@JoinColumn(name = "Category")
	Category category;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPbrand() {
		return pbrand;
	}

	public void setPbrand(String pbrand) {
		this.pbrand = pbrand;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}


	

}
