package com.web.diposite;

public class DipositeModel {

	private Long account;
	private String name;
	private double amount;
	public DipositeModel() {
		super();
		// TODO Auto-generated constructor stub
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
		return "DipositeModel [account=" + account + ", name=" + name + ", amount=" + amount + "]";
	}
	
}
