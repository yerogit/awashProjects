package org.oib.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.oib.model.Rights;
import org.oib.model.Roles;

@Mapper
public interface UserRightsMapper {
    
    @Select("select rights.code from user_role "
    		+ " join roles  on roles.id = user_role.role_id"
    		+ " join role_rights on role_rights.role_id = roles.id"
    		+ " join rights on rights.id = role_rights.right_id"
    		+ " WHERE "
    		+ " user_role.user_id = #{userId}")
    public List<String> getUserRights(Long userId);
 
}
