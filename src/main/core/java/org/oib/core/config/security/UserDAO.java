package org.oib.core.config.security;

import org.apache.log4j.Logger;
import org.oib.admin.mapper.SecurityMapper;
import org.oib.model.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * A custom DAO for accessing data from the database.
 * 
 */
@Component
public class UserDAO {

	protected static Logger logger = Logger.getLogger("dao");

	@Autowired
	SecurityMapper mapper;

	/**
	 * Simulates retrieval of data from a database.
	 */
	public UserAccount searchDatabase(String email) {
		
		return mapper.searchUser(email);
		
	}

}