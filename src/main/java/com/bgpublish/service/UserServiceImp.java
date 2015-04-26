/**
 * 
 */
package com.bgpublish.service;

import lombok.Getter;
import lombok.Setter;

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
	@Setter
	@Getter
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
		return this.userMapper.selectUser(id);
	}

	/**
	 * 根据手机号码和密码登录
	 * @param user 用户(主要是手机号码和密码【密文】)
	 * @return 返回User对象
	 */
	@Override
	public User login(User user){
		return this.userMapper.login(user);
	}
}
