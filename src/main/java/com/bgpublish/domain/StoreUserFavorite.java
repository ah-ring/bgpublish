/**
 * 
 */
package com.bgpublish.domain;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * 商家用户收藏
 * @author ps
 *
 */
public class StoreUserFavorite  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2914418093930189108L;
	private @Getter @Setter int store_id;
	private @Getter @Setter int user_id;
	private @Getter @Setter String create_time;
}
