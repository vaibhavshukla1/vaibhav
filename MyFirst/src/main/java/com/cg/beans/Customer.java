package com.cg.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;

	/*
	 * @NotEmpty(message = "First Name can not be blank")
	 * 
	 * @Pattern(regexp = "[A-z][a-z]{4,}", message =
	 * "Name should contain only alphabets")
	 */
	private String firstName;

	/*
	 * @NotEmpty(message = "Last Name can not be blank")
	 * 
	 * @Pattern(regexp = "[A-z][a-z]{4,}", message =
	 * "Name should contain only alphabets")
	 */
	private String lastName;

	/*
	 * @Min(value = 20, message = "Age should be > 20")
	 * 
	 * @Max(value = 50, message = "Age should be < 50")
	 */
	private int age;
	private String email;

	// @Pattern(regexp = "[0-9]{10}", message = "Mobile no should be 10 digit")
	private String mobileNo;

	private String city;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

}
