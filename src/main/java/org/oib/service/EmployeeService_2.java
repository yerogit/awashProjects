package org.oib.service;

import java.util.List;

import org.oib.admin.mapper.EmployeeMapper;
import org.oib.model.ContactWithoutPersonalInfo;
import org.oib.model.Contacts;
import org.oib.model.Contacts_2;
import org.oib.model.Role;
import org.oib.model.Unit;
import org.oib.model.UserAccount;
import org.oib.model.UserContactModel;
import org.oib.model.UserRoleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService_2 {

	@Autowired
	private EmployeeMapper map;

	@Autowired
	private PasswordEncoder passwordEncoder;

	public void savedatas(UserAccount d) {
		System.out.println("NOTE:::::: SERVICE");
		d.setPassword(passwordEncoder.encode(d.getPassword()));
		map.savedatas(d);
	}

	public void saveUnit(Unit u) {
		System.out.println("NOTE:::::: SERVICE");
		map.saveUnit(u);
	}

	public List<Unit> getAllUnits() {
		return map.getAllUnits();
	}

	public UserAccount getEmpNameById(Long id) {
		return map.getEmpNameById(id);
	}

	public void saveContact(Contacts c) {
		map.saveContact(c);
	}

	public void saveUserContact(UserContactModel c) {
		map.saveUserContact(c);
	}

	public List<UserAccount> searchDatas(String searchKey) {
		return map.searchDatas(searchKey);
	}

	public UserAccount getbyId(Long id) {
		return map.getbyId(id);
	}

	public List<Role> getAllRoles() {
		return map.getAllRoles();
	}

	public List<UserAccount> getAllUsers() {
		return map.getAllUsers();
	}

	public List<Contacts_2> getAllContacts_2() {
		return map.getAllContacts_2();
	}

	public UserAccount getEmployeeId(String empid) {
		return map.getEmployeeId(empid);
	}

	public int getRoleId(int role_id) {
		System.out.println("HERE IS THE ROLE: " + role_id + "ROLE FINISHED");
		return map.getRoleId(role_id);
	}

	public void saveUserRole(UserRoleModel m) {
		map.saveUserRole(m);
	}

	public Contacts getContactId(String email) {
		return map.getContactId(email);
	}

	public void deleteContact(Long id) {
		map.deleteContact(id);
	}

	public ContactWithoutPersonalInfo getContact(Long id) {
		return map.getContact(id);
	}

	public void updateContact(Contacts c) {
		map.updateContact(c);
	}

}
