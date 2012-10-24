package com.mulesoft.examples;

import javax.jws.WebService;
import javax.jws.WebParam;

@WebService
public interface SimpleAccountUpdateService {

	public String updateAccount(@WebParam(name= "accountNameId") String accountNameId) throws Exception;
	
}
