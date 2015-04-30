/**
 * 
 */
package com.bgpublish.mapper;

import com.bgpublish.domain.Store;

/**
 * 商家Mapper
 * @author ps
 *
 */
public interface StoreMapper {
	
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
	 * 删除商家
	 * @param store 商家信息
	 */
	public void deleteStore(Store store);
}
