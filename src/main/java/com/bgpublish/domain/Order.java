/**
 * 
 */
package com.bgpublish.domain;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * 订单信息
 * @author ps
 *
 */
public class Order implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2416617126376984743L;
	
	private @Getter @Setter int order_id;
	private @Getter @Setter int merch_id;
	private @Getter @Setter String name;
	private @Getter @Setter int amount;
	private @Getter @Setter String unit;
	private @Getter @Setter float price;
	private @Getter @Setter float amount_money;
	private @Getter @Setter String currency_unit;
	private @Getter @Setter String buyer_name;
	private @Getter @Setter String buyer_area;
	private @Getter @Setter String buyer_postcode;
	private @Getter @Setter String buyer_phone;
	private @Getter @Setter String buyer_mobile;
	private @Getter @Setter String send_type;
	private @Getter @Setter String send_no;
	private @Getter @Setter String send_time;
	private @Getter @Setter float freight;
	private @Getter @Setter String invoice_need;
	private @Getter @Setter String pay_type;
	private @Getter @Setter String buyer_pay_time;
	private @Getter @Setter String trad_time;
	private @Getter @Setter String update_time;
	private @Getter @Setter String seller_deliver_time;
	private @Getter @Setter String buyer_confirm_time;
	private @Getter @Setter String buyer_del;
	private @Getter @Setter String seller_del;
	private @Getter @Setter String buyer_del_time;
	private @Getter @Setter String seller_del_time;
	private @Getter @Setter String buyer_score;
	private @Getter @Setter String seller_score;
	private @Getter @Setter String status;
}
