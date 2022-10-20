package com.digitalbook.Vo;

import java.util.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.digitalbook.Enum.Salutation;

public class UserVo {
	
	private Integer userId;
	private Salutation salutation;
	private String firstName;
	private String lastName;
	private String userName;
	private String userEmail;
	private String password;
	private String address;
	private String city;
	private String postalCode;
	private Integer mobileNumber;
	private Integer is_active;
	private Date cretedAt;
	private Date updateAt;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Salutation getSalutation() {
		return salutation;
	}

	public void setSalutation(Salutation salutation) {
		this.salutation = salutation;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Integer getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Integer mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Integer getIs_active() {
		return is_active;
	}

	public void setIs_active(Integer is_active) {
		this.is_active = is_active;
	}

	public Date getCretedAt() {
		return cretedAt;
	}

	public void setCretedAt(Date cretedAt) {
		this.cretedAt = cretedAt;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	@Override
	public String toString() {
		return "User [" + (userId != null ? "userId=" + userId + ", " : "")
				+ (salutation != null ? "salutation=" + salutation + ", " : "")
				+ (firstName != null ? "firstName=" + firstName + ", " : "")
				+ (lastName != null ? "lastName=" + lastName + ", " : "")
				+ (userName != null ? "userName=" + userName + ", " : "")
				+ (userEmail != null ? "userEmail=" + userEmail + ", " : "")
				+ (password != null ? "password=" + password + ", " : "")
				+ (address != null ? "address=" + address + ", " : "") + (city != null ? "city=" + city + ", " : "")
				+ (postalCode != null ? "postalCode=" + postalCode + ", " : "")
				+ (mobileNumber != null ? "mobileNumber=" + mobileNumber + ", " : "")
				+ (is_active != null ? "is_active=" + is_active + ", " : "")
				+ (cretedAt != null ? "cretedAt=" + cretedAt + ", " : "")
				+ (updateAt != null ? "updateAt=" + updateAt : "") + "]";
	}

}
