package com.mulesoft.examples;

import javax.jws.WebService;

@WebService(endpointInterface = "com.mulesoft.examples.SimpleAccountUpdateService", serviceName = "SimpleAccountUpdateService")
public class SimpleAccountUpdateServiceSOAPImpl implements SimpleAccountUpdateService {

	@Override
	public String updateAccount(String accountNameId) throws Exception {

		String responseString ="";

		responseString = "Congratulations account " + accountNameId + " has been updated!";
		
		return responseString;
	}

}