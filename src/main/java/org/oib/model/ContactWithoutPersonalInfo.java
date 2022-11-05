package org.oib.model;

import org.oib.core.config.model.BaseModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactWithoutPersonalInfo extends BaseModel {

	private String phonenumber;
	private String email;
	private String officenumber;
	private String city;
	private String cellphonenumber;
	private String address;
}
