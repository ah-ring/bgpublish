/**
 * 
 */
package com.bgpublish.domain;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * 商品优惠信息
 * @author ps
 *
 */
public class MerchDisacount implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4112888621761248667L;

	private @Getter @Setter int disacount_id;
	private @Getter @Setter int merch_id;
	private @Getter @Setter float disacount_money;
	private @Getter @Setter float disacount;
	private @Getter @Setter String disacount_date;
	private @Getter @Setter String effective_date;
	private @Getter @Setter String create_time;
}
