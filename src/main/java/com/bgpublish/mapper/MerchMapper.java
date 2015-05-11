/**
 * 
 */
package com.bgpublish.mapper;

import java.util.List;

import com.bgpublish.domain.Merch;

/**
 * 商品mapper
 * @author ps
 *
 */
public interface MerchMapper {
	/**
	 * 添加商品
	 * @param merch
	 */
	public void addMerch(Merch merch);
	/**
	 * 更新商品
	 * @param merch
	 */
	public void updateMerch(Merch merch);
	/**
	 * 根据商品ID删除商品
	 * @param merch_id 商品ID
	 */
	public void deleteMerchById(String merch_id);
	/**
	 * 根据商家ID删除商品
	 * @param store_id 商家ID
	 */
	public void deleteMerchByStoreId(String merch_id);
	/**
	 * 根据商品ID查询商品信息
	 * @param merch_id 商品ID
	 * @return
	 */
	public Merch queryMerchById(String merch_id);
	/**
	 * 根据商家ID查询商品信息
	 * @param store_id 商家ID
	 * @return
	 */
	public List<Merch> queryMerchByStoreId(String store_id);
	/**
	 * 根据用户ID查询商品信息
	 * @param user_id 用户ID
	 * @return
	 */
	public List<Merch> queryMerchByUserId(String user_id);
}