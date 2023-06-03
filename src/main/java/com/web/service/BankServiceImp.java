package com.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.balance_transfer.TransferModel;
import com.web.diposite.DipositeModel;
import com.web.entity.Bank;
import com.web.getbalance.GetBalance;
import com.web.model.BankModel;
import com.web.repo.BankRepo;
import com.web.withdraw.WithdrawModel;

@Service
public class BankServiceImp implements BankService{
	@Autowired 
	private BankRepo bankRepo;

	@Override
	public Bank saveAccountDetails(BankModel bank) {
		Bank model=new Bank();
		if(bank.getPassword().equalsIgnoreCase(bank.getcPassword())) 
			model.setPassword(bank.getPassword());;
		model.setAccountNo(bank.getAccount());
		model.setName(bank.getName());
		model.setBalance(bank.getAmount());
		model.setAddress(bank.getAddress());
		model.setMobile(bank.getMobile());
		model.setStatus(1);
		return bankRepo.save(model);
		}

	@Override
	public String getBalance(Long acc) {
		Bank b1=bankRepo.findById(acc).get();
		GetBalance bal=new GetBalance();
		if(b1.getAccountNo()==acc) {
			bal.setAccount(b1.getAccountNo());
			bal.setName(b1.getName());
			bal.setAmount(b1.getBalance());
			return "Account No:-" +bal.getAccount()+"\nAccount Name:-"+bal.getName()+"\nBalance:-"+bal.getAmount();
		}
		else {
			return "check the input..";
		}	
	}

	@Override
	public String diposite(DipositeModel diposite) {
	Bank b2=bankRepo.findById(diposite.getAccount()).get();
	String res="Previous Balance ---------->"+ b2.getBalance()+"\n Diposite Amount------>"+diposite.getAmount();
	if(b2.getAccountNo()==diposite.getAccount()) {
		double dipo=b2.getBalance()+diposite.getAmount();
		b2.setBalance(dipo);
	}
	Bank bk=bankRepo.save(b2);
	String s2= "\nCurrent Balance------->"+bk.getBalance();
    String result=res+s2;
	if(bk!=null) {
    	return result;
    }
    else {
    	return "Check the input..................";
    }
    

	}

	@Override
	public String withDraw(WithdrawModel withdraw) {
		Bank b3=bankRepo.findById(withdraw.getAccount()).get();
		String res="Previous Balance ---------->"+ b3.getBalance()+"\n Withdraw Amount------>"+withdraw.getAmount();
		if(b3.getAccountNo()==withdraw.getAccount()) {
			double with=b3.getBalance()-withdraw.getAmount();
			b3.setBalance(with);
		}
		Bank bk1=bankRepo.save(b3);
		String s2= "\nCurrent Balance------->"+bk1.getBalance();
	    String result=res+s2;
		if(bk1!=null) {
	    	return result;
	    }
	    else {
	    	return "Check the input..................";
	    }
		
	}

	@Override
	public String transfer(TransferModel trans) {
		Bank a1=bankRepo.findById(trans.getAccount()).get();
		Bank a2=bankRepo.findById(trans.getTargetAccount()).get();
		String res="Previous Balance---->"+a1.getBalance()+"\n Transfer Amount------->"+trans.getAmount();
		String res3="\n Target Account Balance---->"+a2.getBalance();
		if(a1.getName().equals(trans.getName()) && a1.getAccountNo()==trans.getAccount()) {
			double k=a1.getBalance()-trans.getAmount();
			a1.setBalance(k);
			double k1=a2.getBalance()+trans.getAmount();
			a2.setBalance(k1);
		}
		String res1="\n Current Balance--->"+a1.getBalance();
		String res2="\n Current Balances Of Target Balance------>"+a2.getBalance();
		Bank b1=bankRepo.save(a1);
		Bank b2=bankRepo.save(a2);
		String result=res+res1+res2+res3;
		if(b1!=null && b2!=null) {
			return result;
		}
		else {
			return "Click the input";
		}
		
	}
	
	

	
	

}
