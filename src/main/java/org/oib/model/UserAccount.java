package org.oib.model;

import java.util.Collection;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.oib.core.config.model.BaseModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserAccount extends BaseModel {
	
	@NotEmpty(message = "{firstname.required}")
	private String firstname;

	@NotEmpty(message = "{lastname.required}")
	private String lastname;
	
	private String department;

	@NotEmpty(message = "{password.required}")
	private String password;
	
	private String gender;

	private String status;

	@Email(message = "{email.invalid}")
	@NotEmpty(message = "{email.required}")
	private String email;

	
	@NotEmpty(message = "{roles.required}")
	private Collection<Roles> roles;
	
	@NotEmpty(message = "{rights.required}")
	private Collection<Rights> rights;

}
