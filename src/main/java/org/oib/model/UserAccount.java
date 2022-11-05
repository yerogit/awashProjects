package org.oib.model;

import java.util.Collection;
import java.util.List;

import javax.validation.constraints.AssertTrue;

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
	
	private Long role;
	
	@Email(message = "{email.invalid}")
	@NotEmpty(message = "{email.required}")
	private String empid;
	
	private String gender;
	
	private String photolocation;
	
	@NotEmpty(message = "{firstName.required}")
	private String firstname;

	@NotEmpty(message = "{lastName.required}")
	private String lastname;

	private String department;

	@NotEmpty(message = "{password.required}")
	private String password;

	@NotEmpty(message = "{confirmPassword.required}")
	private String confirmPassword;

	private int enabled;
	
	private List<String> rights;
	
	@Email(message = "{email.invalid}")
	@NotEmpty(message = "{email.required}")
	private String email;

	@NotEmpty(message = "{roles.required}")
	private Collection<Role> roles;
	
	@AssertTrue(message = "{confirmPassword.not.match}")
	private boolean isValid() {
		if (password == null) {
			return confirmPassword == null;
		} else {
			return password.equals(confirmPassword);
		}
	}
}
