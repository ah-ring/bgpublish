/**
 * 
 */
package com.bgpublish.web;

import lombok.Getter;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bgpublish.domain.User;
import com.bgpublish.service.UserService;

/**
 * 用户 信息Web Controller
 * 
 * @author pansen
 *
 */
@RestController
@RequestMapping(value="/sgams/user")
public class UserController {

	@Autowired
	@Getter
	@Setter
	private UserService userService;

	@RequestMapping(value="/query.do", method = RequestMethod.GET)
	@ResponseBody
	public User selectUser(String id) {

		return this.userService.selectUser(id);
	}

	@RequestMapping(value="/login.do", method = RequestMethod.POST)
	@ResponseBody
	public User login(@RequestBody User user) {

		return this.userService.login(user);
	}
}
