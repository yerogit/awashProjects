
package org.oib.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.oib.model.Contacts;
import org.oib.model.ContactsWithEmployeeInfo;
import org.oib.model.Units;
import org.oib.model.UserAccount;

public interface EmployeeMapper {
	
   @Insert("insert into units(departmentName, description, status)"+"values(#{departmentName},#{description},#{status} )")
   public void addUnit(Units u);
   
   @Select("select * from units where (departmentName like '%'+#{searchKey}+'%'"
			+ " or description like '%'+#{searchKey}+'%') and status = 1")
   public List<Units> searchUnit(String searchKey);
   
   @Select("select * from units where id = #{id}")
   public Units getUnitById(Long id);
   
   @Update("update units set departmentName = #{departmentName}, description = #{description} where id"
			+ "= #{id}")
   public void UpdateUnit(Units u);
  
   @Update("update units set status=0 where id=#{id}")
   public void deleteUnit(Long id);
   

}
