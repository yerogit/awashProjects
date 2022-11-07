package org.oib.controller;

import java.text.ParseException;

import org.oib.core.controller.response.AGPResponse;
import org.oib.model.UserAccount;
import org.oib.service.EmployeeService_2;
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

@RestController
@RequestMapping("/roles/")
public class EmployeeRoleController_2 extends BaseController {
//	@Autowired
//	private EmployeeService_2 serv;
//
//	@RequestMapping(value = "register", method = RequestMethod.POST)
//	public ResponseEntity<AGPResponse> register(@RequestBody UserAccount d) throws ParseException {
//
//		System.out.println("NOTE:::::: CONTROLLER");
//		try {
//			if (d.getId() == null) {
//
//				serv.savedatas(d);
//			} else {
////				serv.updateData(d);
//			}
//		} catch (DuplicateKeyException ex) {
//			return AGPResponse.error(getMessage("exists"), HttpStatus.UNPROCESSABLE_ENTITY);
//		}
//
//		return AGPResponse.success(getMessage("Completed"));
//	}
//
//	@RequestMapping(value = "searchDatas", method = RequestMethod.GET)
//	public ResponseEntity searchDatas(@RequestParam String searchKey) {
//
//		return AGPResponse.response(serv.searchDatas(searchKey));
//	}
//
//	@RequestMapping(value = "getbyId/{id}", method = RequestMethod.GET)
//	public ResponseEntity getbyId(@PathVariable("id") Long id) {
//
//		return AGPResponse.response(serv.getbyId(id));
//	}
//
//	@RequestMapping(value = "view", method = RequestMethod.GET)
//	public ResponseEntity getAllRoles() {
//
//		return AGPResponse.response(serv.getAllRoles());
//	}

}
