/**
 * 
 */
package com.bgpublish.domain;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * 用户 Entity
 * 
 * @author pansen
 *
 */
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1677958995472763643L;
	
	@Getter
	@Setter
	private int user_id;
	
	@Getter
	@Setter
	private String name;
	
	@Getter
	@Setter
	private String password;

	@Getter
	@Setter
	private String mobile;

	@Getter
	@Setter
	private String address;

	@Getter
	@Setter
	private String shopName;

	@Getter
	@Setter
	private String createTime;

	@Getter
	@Setter
	private String userType;

	@Getter
	@Setter
	private String qq;

	@Getter
	@Setter
	private String weChat;
}
