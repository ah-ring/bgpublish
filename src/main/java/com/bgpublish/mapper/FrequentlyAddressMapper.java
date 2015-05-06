/**
 * 
 */
package com.bgpublish.mapper;

import java.util.List;

import com.bgpublish.domain.FrequentlyAddress;

/**
 * 常用地址Mapper
 * @author ps
 *
 */
public interface FrequentlyAddressMapper {
	/**
	 * 新增常用地址
	 * @param frequentlyAddress 常用地址
	 */
	public void addFrequentlyAddress(FrequentlyAddress frequentlyAddress);
	/**
	 * 删除常用地址
	 * @param freqa_id 常用地址ID
	 */
	public void deleteFrequentlyAddressById(String freqa_id);
	/**
	 * 更新常用地址
	 * @param frequentlyAddress 常用地址
	 */
	public void updateFrequentlyAddress(FrequentlyAddress frequentlyAddress);
	/**
	 * 根据用户ID查询该用户下所有常用地址
	 * @param user_id 用户ID
	 * @return
	 */
	public List<FrequentlyAddress> queryByUserId(String user_id);
	
}
