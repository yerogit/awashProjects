package org.oib.admin.mapper;

public interface EmployeeMapper {
//
//	@Insert("insert into users(email, firstname, lastname, department, password, enabled, gender) "
//			+ "values(#{empid},#{firstname},#{lastname},#{department},#{password},#{enabled},#{gender})")
//	public void savedatas(UserAccount d);
//
//	@Insert("insert into units(name, description) values(#{name},#{description})")
//	public void saveUnit(Unit u);
//
//	@Insert("insert into contacts(phonenumber, email"
//			+ ", officenumber, city, cellphonenumber, address, status) values(#{phoneNumber}"
//			+ ", #{email}, #{officeNumber}, #{city}, #{cellPhoneNumber}, #{address}, #{status})")
//	public void saveContact(Contacts c);
//
////	@Insert("insert into user_contact(user_Id, contact_id) values(#{user_Id},#{contact_id})")
////	public void saveUserContact(UserContactModel c);
//
//	@Select("select u.id, email, firstname, lastname, department"
//			+ " from users u LEFT JOIN user_contact uc on u.id = uc.user_Id where "
//			+ "(u.email like concat('%',#{searchKey},'%') or " + "u.firstname like concat('%',#{searchKey},'%') or "
//			+ "u.lastname like concat('%',#{searchKey},'%') or " + "u.department like concat('%',#{searchKey},'%') or "
//			+ "u.gender like concat('%',#{searchKey},'%')) and uc.user_Id IS NULL")
//	public List<UserAccount> searchDatas(String searchKey);
//
//	@Select("select * from users where id=#{id}")
//	public UserAccount getbyId(Long id);
//
//	@Select("select firstname, lastname from users where id=#{id}")
//	public UserAccount getEmpNameById(Long id);
//
//	@Select("select * from roles")
//	public List<Role> getAllRoles();
//
//	@Select("select * from users")
//	public List<UserAccount> getAllUsers();
//
//	@Select("select * from units")
//	public List<Unit> getAllUnits();
//
//	@Select("select users.id, users.email," + "users.firstname," + "users.lastname," + "users.gender,"
//			+ "users.department," + "contacts.phonenumber," + "contacts.email as email_2," + "contacts.cellphonenumber,"
//			+ "contacts.officenumber," + "contacts.city, contacts.id as contact_id, "
//			+ "contacts.address from users, contacts, user_contact where " + "users.id = user_contact.user_id and "
//			+ "user_contact.contact_id = contacts.id and users.enabled = 1 and contacts.status = 1")
//	public List<Contacts_2> getAllContacts_2();
//
//	@Select("select * from users where email = #{empid}")
//	public UserAccount getEmployeeId(String empid);
//
//	@Select("select id from roles where name = #{role}")
//	public int getRoleId(int role_id);
//
//	@Insert("insert into user_role(user_id, role_id) values(#{user_id},#{role_id})")
//	public void saveUserRole(UserRoleModel m);
//
//	@Select("select id from contacts where email = #{email} and status = 1")
//	public Contacts getContactId(String email);
//
//	@Select("update contacts set status = 0 where id = #{id}")
//	public void deleteContact(Long id);
//
//	@Select("select * from contacts where id = #{id} and status = 1")
//	public ContactWithoutPersonalInfo getContact(Long id);
//
//	@Update("update contacts set " + "phonenumber = #{phoneNumber}," + "email = #{email},"
//			+ "officenumber = #{officeNumber}," + "city = #{city}," + "cellphonenumber = #{cellPhoneNumber},"
//			+ "address = #{address} where id = #{contact_id} ")
//	public void updateContact(Contacts c);

}
