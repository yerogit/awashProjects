package org.oib.controller;

import org.oib.core.controller.response.AGPResponse;
import org.oib.model.Units;
import org.oib.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nimbusds.oauth2.sdk.ParseException;
@RestController
@RequestMapping("/employee/")
public class UnitController extends BaseController{
	@Autowired
	private UnitService service;
	
	@RequestMapping(value = "unit/add", method = RequestMethod.POST)
	public ResponseEntity<AGPResponse> saveUnit(@RequestBody Units u) throws ParseException {
		try {
			if (u.getId() == null) {
				service.addUnit(u);
			} else {
				
			service.updateUnit(u);
			}
		} catch (DuplicateKeyException ex) {
			return AGPResponse.error(getMessage("exists"), HttpStatus.UNPROCESSABLE_ENTITY);
		}

		return AGPResponse.success(getMessage("Completed"));
	}

	@RequestMapping(value="unit/search", method = RequestMethod.GET)
	public ResponseEntity searchDepartments(@RequestParam String searchKey){
		System.out.println("ffffdxrdt");
		return AGPResponse.response(service.searchUnit(searchKey));
		
	}
	@RequestMapping(value="unit/fetchEdit/{cid}", method = RequestMethod.GET)
	public ResponseEntity FetchDepartmentById(@PathVariable("cid") Long id){
		return AGPResponse.response(service.getUnitById(id));
 }
	 
	@RequestMapping(value = "unit/delete/{uid}", method = RequestMethod.POST)
	public void deleteUser(@PathVariable("uid") Long id) throws ParseException {
		
		System.out.println("hellooo:::::::::" + id);
		service.deleteUnit(id);
	}

}
