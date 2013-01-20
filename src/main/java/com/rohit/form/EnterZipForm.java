package com.rohit.form;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;
import org.springframework.stereotype.Component;

@SuppressWarnings("unused")
public class EnterZipForm
{
	@Length(max=5,min=5,message="Zip Code is not valid. Should be of length 5.")
    @NotEmpty(message="Enter a valid zipcode value.")
	private String zipcode;

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	

	
}
