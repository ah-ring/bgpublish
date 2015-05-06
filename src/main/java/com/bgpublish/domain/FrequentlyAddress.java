/**
 * 
 */
package com.bgpublish.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * 常用地址Bean
 * @author ps
 *
 */
public class FrequentlyAddress {
	private @Setter @Getter int freqa_id;
	private @Setter @Getter int user_id;
	private @Setter @Getter String address;
	private @Setter @Getter String mobile;
	private @Setter @Getter String user_name;
	private @Setter @Getter String create_time;
}
