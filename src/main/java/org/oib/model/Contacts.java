package org.oib.model;

import org.oib.core.config.model.BaseModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contacts extends BaseModel{
	private String phoneNumber;
	private String email;
	private String officePhoneNumber;
	private String officeNumber;
	private String city;
	private String cellPhoneNumber;
	private String address;
	private String status;
	private Long user_id;
	private Long contact_id;
}
