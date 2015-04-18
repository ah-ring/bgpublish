/**
 * 
 */
package com.bgpublish.service;

import com.bgpublish.domain.User;

/**
 * 用户 服务信息接口
 * 
 * @author pansen
 *
 */
public interface UserService {
	/**
	 * 根据用户Id查询用户信息
	 * 
	 * @param id
	 *            用户 Id
	 * @return 返回User对象
	 */
	public User selectUser(String id);
}
