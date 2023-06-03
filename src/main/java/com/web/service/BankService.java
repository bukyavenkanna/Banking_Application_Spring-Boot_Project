package com.web.service;

import com.web.balance_transfer.TransferModel;
import com.web.diposite.DipositeModel;
import com.web.entity.Bank;
import com.web.model.BankModel;
import com.web.withdraw.WithdrawModel;

public interface BankService {

	public Bank saveAccountDetails(BankModel bank);
	public String getBalance(Long acc);
	public String diposite(DipositeModel diposite);
	public String withDraw(WithdrawModel withdraw);
	public String transfer(TransferModel trans);
}
