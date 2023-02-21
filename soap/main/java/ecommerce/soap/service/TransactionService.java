package ecommerce.soap.service;

import java.util.Random;

import org.springframework.stereotype.Service;

import ecommerce.soap.loaneligibility.Acknowledgement;
import ecommerce.soap.loaneligibility.CustomerRequest;

@Service
public class TransactionService {

	public Acknowledgement checkTransactionStatus(CustomerRequest request) {
		Acknowledgement acknowledgement = new Acknowledgement();
		Random randomNum = new Random();
		int value = randomNum.nextInt(100);
		if(value>=91 && value<=100)
			acknowledgement.setIsSuccess(false);
		else
			acknowledgement.setIsSuccess(true);
		return acknowledgement;

	}

}
