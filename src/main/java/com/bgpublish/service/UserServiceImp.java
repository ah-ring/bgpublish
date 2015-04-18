/**
 * 
 */
package com.bgpublish.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bgpublish.domain.User;
import com.bgpublish.mapper.UserMapper;

/**
 * 用户 服务信息实现类
 * 
 * @author pansen
 *
 */
@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserMapper userMapper;

	/**
	 * 根据用户Id查询用户信息
	 * 
	 * @param id
	 *            用户 Id
	 * @return 返回User对象
	 * @see com.bgpublish.service.UserService#selectUser(java.lang.String)
	 */
	@Override
	public User selectUser(String id) {
		return this.selectUser(id);
	}

}
