package com.web.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="BankAccount")
public class Bank {
	@Id
	private Long accountNo;
	private String name;
	private String password;
	private double balance;
	private String address;
	private Long mobile;
	private int status;
	public Bank() {
		super();
	}
	public Bank(Long accountNo, String name, String password, double balance, String address, Long mobile, int status) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.password = password;
		this.balance = balance;
		this.address = address;
		this.mobile = mobile;
		this.status = status;
	}
	public Long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(Long accountNo) {
		this.accountNo = accountNo;
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
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
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
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Bank [accountNo=" + accountNo + ", name=" + name + ", password=" + password + ", balance=" + balance
				+ ", address=" + address + ", mobile=" + mobile + ", status=" + status + "]";
	}
	
	}
	