package ecommerce.soap.emdpoint;

import ecommerce.soap.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import ecommerce.soap.loaneligibility.Acknowledgement;
import ecommerce.soap.loaneligibility.CustomerRequest;

@Endpoint
public class TransactionIndicatorEndpoint {

	private static final String NAMESPACE = "ecommerce/soap/Transactions";
	@Autowired
	private TransactionService service;

	@PayloadRoot(namespace = NAMESPACE, localPart = "Transaction")
	@ResponsePayload
	public Acknowledgement getLoanStatus(@RequestPayload CustomerRequest request) {
		return service.checkTransactionStatus(request);
	}

}
