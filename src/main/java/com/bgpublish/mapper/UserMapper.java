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
	/**
	 * 根据手机号码和密码登录
	 * @param user 用户(主要是手机号码和密码【密文】)
	 * @return 返回User对象
	 */
	public User login(User user);
}
