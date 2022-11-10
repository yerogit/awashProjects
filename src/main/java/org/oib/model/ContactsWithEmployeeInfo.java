package org.oib.model;

import java.util.Collection;

import org.oib.core.config.model.BaseModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ContactsWithEmployeeInfo extends BaseModel {

	//This Model is needed to hold contact info and employee information for "contacts list view"
	//The next 5 variables hold data from users table
	private Long user_id;
	private String firstname;
	private String lastname;
	private String gender;
	private String department;
	private String empid;
	
	//The next 8 variables hold data from contacts table
	private Long contact_id;
	private String phonenumber;
	private String email;
	private String cellphonenumber;
	private String officenumber;
	private String city;
	private String address;
}
