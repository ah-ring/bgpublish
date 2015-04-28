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
	private String shop_name;

	@Getter
	@Setter
	private String create_time;

	@Getter
	@Setter
	private String user_type;

	@Getter
	@Setter
	private String qq;

	@Getter
	@Setter
	private String we_chat;
	
	@Getter
	@Setter
	private String old_password;
}
