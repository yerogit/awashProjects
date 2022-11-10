package org.oib.model;


import org.oib.core.config.model.BaseModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Units extends BaseModel{

	private String name;
	private String description;
	private String status;
}
