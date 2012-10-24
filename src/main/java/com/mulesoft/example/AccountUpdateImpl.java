package com.mulesoft.example;

public class AccountUpdateImpl implements AccountUpdate {

	@Override
	public String updateAccount(String accountNameId)
			throws Exception_Exception {

		String responseString ="";

		responseString = "Congratulations account " + accountNameId + " has been updated!";
		
		return responseString;
	}

}
