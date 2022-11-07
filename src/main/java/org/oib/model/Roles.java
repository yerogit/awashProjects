package org.oib.model;

import java.util.Collection;

import org.hibernate.validator.constraints.NotEmpty;
import org.oib.core.config.model.BaseModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
public class Roles extends BaseModel {

	@NotEmpty(message = "{code.required}")
	private String code;
	
	@NotEmpty(message = "{name.required}")
	private String name;
	
	private String description;
	
	private String status;
	
	@NotEmpty(message = "{rights.required}")
	private Collection<Rights> rights;
	
}
