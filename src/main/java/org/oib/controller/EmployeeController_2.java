package org.oib.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/employee/")
public class EmployeeController_2 extends BaseController {
//	@Autowired
//	private EmployeeService_2 serv;
//
//	@RequestMapping(value = "register", method = RequestMethod.POST)
//	public ResponseEntity<AGPResponse> register(@RequestBody UserAccount d) throws ParseException {
//
//		System.out.println("NOTE:::::: CONTROLLER");
//		try {
//			if (d.getId() == null) {
//				serv.savedatas(d);
//
//				UserRoleModel m = new UserRoleModel();
//				UserAccount theuser = serv.getEmployeeId(d.getEmpid());
//				m.setUser_id(theuser.getId());
//				m.setRole_id(d.getRole());
//
//				serv.saveUserRole(m);
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
//	@RequestMapping(value = "saveUnit", method = RequestMethod.POST)
//	public ResponseEntity<AGPResponse> saveUnit(@RequestBody Unit u) throws ParseException {
//
//		System.out.println("NOTE:::::: CONTROLLER");
//		try {
//			if (u.getId() == null) {
//				serv.saveUnit(u);
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
//	@RequestMapping(value = "saveContact", method = RequestMethod.POST)
//	public ResponseEntity<AGPResponse> saveContact(@RequestBody Contacts c) throws ParseException {
//
//		System.out.println("NOTE:::::: CONTROLLER");
//		try {
//			if (c.getContact_id() == null) {
//				serv.saveContact(c);
//
//				Contacts cc = new Contacts();
//				cc = serv.getContactId(c.getEmail());
//
//				UserContactModel m = new UserContactModel();
//				m.setUser_Id(c.getUser_id());
//				m.setContact_id(cc.getId());
//
//				serv.saveUserContact(m);
//
//			} else {
//				serv.updateContact(c);
//			}
//		} catch (DuplicateKeyException ex) {
//			return AGPResponse.error(getMessage("exists"), HttpStatus.UNPROCESSABLE_ENTITY);
//		}
//
//		return AGPResponse.success(getMessage("Completed"));
//	}
//
//	@RequestMapping(value = "contact/add/{id}", method = RequestMethod.GET)
//	public ResponseEntity getEmpNameById(@PathVariable("id") Long id) {
//
//		return AGPResponse.response(serv.getEmpNameById(id));
//	}
//
//	@RequestMapping(value = "searchDatas/{searchKey}", method = RequestMethod.GET)
//	public ResponseEntity searchDatas(@PathVariable("searchKey") String searchKey) {
//
//		System.out.println("SEARCH KEY: : " + searchKey);
//		return AGPResponse.response(serv.searchDatas(searchKey));
//	}
//
//	@RequestMapping(value = "getbyId/{id}", method = RequestMethod.GET)
//	public ResponseEntity getbyId(@PathVariable("id") Long id) {
//
//		return AGPResponse.response(serv.getbyId(id));
//	}
//
//	@RequestMapping(value = "contact/delete/{id}", method = RequestMethod.GET)
//	public ResponseEntity<AGPResponse> deleteContact(@PathVariable("id") Long id) {
//		serv.deleteContact(id);
//		return AGPResponse.success(getMessage("Completed"));
//	}
//
//	@RequestMapping(value = "contact", method = RequestMethod.GET)
//	public ResponseEntity getAllContacts() {
//		System.out.println(serv.getAllContacts_2());
//
//		return AGPResponse.response(serv.getAllContacts_2());
//	}
//
//	@RequestMapping(value = "fetchUnits", method = RequestMethod.GET)
//	public ResponseEntity getAllUnits() {
//
//		return AGPResponse.response(serv.getAllUnits());
//	}
//
//	@RequestMapping(value = "users", method = RequestMethod.GET)
//	public ResponseEntity getAllUsers() {
//
//		return AGPResponse.response(serv.getAllUsers());
//	}
//
//	@RequestMapping(value = "contact/get/{id}", method = RequestMethod.GET)
//	public ResponseEntity getContact(@PathVariable("id") Long id) {
//		ContactWithoutPersonalInfo a = new ContactWithoutPersonalInfo();
//		a = serv.getContact(id);
//		System.out.println("CONTACT SINGLE::::::::" + a.getAddress() + ":" + a.getCellphonenumber() + ":" + a.getCity()
//				+ ":" + a.getEmail() + ":" + a.getOfficenumber() + ":" + a.getPhonenumber() + ":" + a.getId());
//		return AGPResponse.response(a);
//	}

}
