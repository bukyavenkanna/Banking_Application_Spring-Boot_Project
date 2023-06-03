package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.balance_transfer.TransferModel;
import com.web.diposite.DipositeModel;
import com.web.entity.Bank;
import com.web.model.BankModel;
import com.web.service.BankService;
import com.web.withdraw.WithdrawModel;

@RestController
public class BankController {

	@Autowired
	private BankService bankSer;
	@PostMapping("/save")
	public String save(@RequestBody BankModel bank) {
		Bank b=bankSer.saveAccountDetails(bank);
		String res=null;
		if(b!=null) {
			res="Data inserted SuccessFully......";
		}
		else {
			res="Data Save to failed......";
		}
		return res;
	}
	@GetMapping("/get/{account}")
	public String getBalance(@PathVariable Long account) {
		
		return bankSer.getBalance(account);
	}
	@PutMapping("/diposite")
	public String dipositePage(@RequestBody DipositeModel dip) {
		return bankSer.diposite(dip);
	}
	
	@PutMapping("/withdraw")
	public String withdrawPage(@RequestBody WithdrawModel with) {
		
		return bankSer.withDraw(with);
		
	}
	@PutMapping("/transfer")
	public String transferPage(@RequestBody TransferModel trans) {
		return bankSer.transfer(trans);
	}
	
}
