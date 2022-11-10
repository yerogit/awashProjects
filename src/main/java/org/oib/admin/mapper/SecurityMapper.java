package org.oib.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.oib.model.UserAccount;

@Mapper
public interface SecurityMapper {

	@Select("select * from users where email = #{email}")
	@Results(value = { @Result(property = "id", column = "id"),
			@Result(property = "roles", javaType = List.class, column = "id", many = @Many(select = "org.oib.admin.mapper.UserRoleMapper.getRolesByUserId")),
			@Result(property = "rights", javaType = List.class, column = "id", many = @Many(select = "org.oib.admin.mapper.UserRightsMapper.getUserRights"))
	})
	public UserAccount searchUser(String email);
}
