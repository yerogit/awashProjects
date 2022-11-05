package org.oib.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.oib.model.Right;
import org.oib.model.Role;

@Mapper
public interface UserRoleMapper {

	@Select("select r.* from roles r join user_role ur on r.id = ur.role_id where ur.user_id = #{userId}")
	public List<Role> getRolesByUserId(Long userId);
	
}
