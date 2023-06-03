package com.web.model;

public class BankModel {
private Long account;
private String name;
private String password;
private String cPassword;
private double amount;
private String address;
private Long mobile;
public BankModel() {
	super();
	// TODO Auto-generated constructor stub
}
public BankModel(Long account, String name, String password, String cPassword, double amount, String address,
		Long mobile) {
	super();
	this.account = account;
	this.name = name;
	this.password = password;
	this.cPassword = cPassword;
	this.amount = amount;
	this.address = address;
	this.mobile = mobile;
}
public Long getAccount() {
	return account;
}
public void setAccount(Long account) {
	this.account = account;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getcPassword() {
	return cPassword;
}
public void setcPassword(String cPassword) {
	this.cPassword = cPassword;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Long getMobile() {
	return mobile;
}
public void setMobile(Long mobile) {
	this.mobile = mobile;
}
@Override
public String toString() {
	return "BankModel [account=" + account + ", name=" + name + ", password=" + password + ", cPassword=" + cPassword
			+ ", amount=" + amount + ", address=" + address + ", mobile=" + mobile + "]";
}

}
