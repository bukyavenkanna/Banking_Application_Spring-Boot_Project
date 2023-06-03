package com.web.getbalance;

public class GetBalance {

	private Long account;
	private String name;
	private double amount;
	public GetBalance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GetBalance(Long account, String name, double amount) {
		super();
		this.account = account;
		this.name = name;
		this.amount = amount;
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
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "GetBalance [account=" + account + ", name=" + name + ", amount=" + amount + "]";
	}
	
}
