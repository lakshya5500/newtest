package com.ecom.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@ToString
public class Category {

	@Id
	@NotEmpty
	@Size(min = 3,message = "Sub_Category should have three characters")
	@Column(length = 20, name = "Sub_Category")
	String subcat;
	
	@NotEmpty
	@Size(min = 3,message = "Category should have three characters")
	@Column(length = 20, name = "Category")
	String cat;
	
	@NotEmpty
	@Size(min = 3,message = "image url should must imporatant")
	@Column(length = 150, name = "Image")
	String imgUrl;

	public String getSubcat() {
		return subcat;
	}

	public void setSubcat(String subcat) {
		this.subcat = subcat;
	}

	public String getCat() {
		return cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

}
