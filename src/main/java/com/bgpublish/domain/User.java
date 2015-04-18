/**
 * 
 */
package com.bgpublish.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * 用户 Entity
 * @author pansen
 *
 */
public class User {
	@Getter @Setter private String name;
	@Getter @Setter private String password;
}
