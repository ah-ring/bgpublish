/**
 * 
 */
package com.bgpublish.mapper;

import com.bgpublish.domain.User;

/**
 * 用户Mapper接口
 * @author pansen
 * @see src/main/resources/com/bgpublish/mapper/UserMapper.xml
 */
public interface UserMapper {
	
	/**
	 * 根据用户Id查询用户信息
	 * @param id 用户 Id
	 * @return 返回User对象
	 */
	public User selectUser(String id);
}
