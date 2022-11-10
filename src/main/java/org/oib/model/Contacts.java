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
public class Contacts extends BaseModel{

	private String phonenumber;
	private String email;
	private String officenumber;
	private String city;
	private String cellphonenumber;
	private String address;
	private String status;
}
