package org.oib.model;

import org.oib.core.config.model.BaseModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contacts_2 extends BaseModel{
	private Long id;
	private Long contact_id;
	private String email;
	private String firstName;
	private String lastName;
	private String gender;
	private String department;
	private String phoneNumber;
	private String email_2;
	private String officeNumber;
	private String city;
	private String cellPhoneNumber;
	private String address;
}
