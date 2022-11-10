package org.oib.model;

import org.oib.core.config.model.BaseModel;

import lombok.Data;

@Data
public class Rights extends BaseModel {
	
	private String code;
	private String description;
	private String status;
}
