/**
 * 
 */
package com.bgpublish.service;

import com.bgpublish.domain.Store;

/**
 * 商家 服务信息接口
 * 
 * @author pansen
 *
 */
public interface StoreService {
	/**
	 * 新增商家
	 * @param store 商家信息
	 */
	public void addStore(Store store);
	/**
	 * 更新商家信息
	 * @param store 商家信息
	 */
	public void updateStore(Store store);
	/**
	 * 根据商家ID删除商家
	 * @param store_id 商家ID
	 */
	public void deleteStoreById(String store_id);
	/**
	 * 根据商家ID查询商家
	 * @param store_id 商家ID
	 * @return 返回商家信息
	 */
	public Store queryStoreById(String store_id);
}
