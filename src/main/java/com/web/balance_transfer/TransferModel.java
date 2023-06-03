package com.web.balance_transfer;

public class TransferModel {

	private Long account;
	private String name;
	private double amount;
	private Long targetAccount;
	public TransferModel() {
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
	public Long getTargetAccount() {
		return targetAccount;
	}
	public void setTargetAccount(Long targetAccount) {
		this.targetAccount = targetAccount;
	}
	@Override
	public String toString() {
		return "TransferModel [account=" + account + ", name=" + name + ", amount=" + amount + ", targetAccount="
				+ targetAccount + "]";
	}
	
}
