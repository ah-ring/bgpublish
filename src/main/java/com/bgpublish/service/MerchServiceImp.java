/**
 * 
 */
package com.bgpublish.service;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bgpublish.domain.Merch;
import com.bgpublish.mapper.MerchMapper;

/**
 * @author ps
 *
 */
@Service
public class MerchServiceImp implements MerchService {
	
	private @Autowired @Getter @Setter MerchMapper merchMapper;

	/**
	 * 添加商品
	 * @param merch
	 */
	public void addMerch(Merch merch){
		this.merchMapper.addMerch(merch);
	}
	/**
	 * 更新商品
	 * @param merch
	 */
	public void updateMerch(Merch merch){
		this.merchMapper.updateMerch(merch);
	}
	/**
	 * 根据商品ID删除商品
	 * @param merch_id 商品ID
	 */
	public void deleteMerchById(String merch_id){
		this.merchMapper.deleteMerchById(merch_id);
	}
	/**
	 * 根据商家ID删除商品
	 * @param store_id 商家ID
	 */
	public void deleteMerchByStoreId(String merch_id){
		this.merchMapper.deleteMerchByStoreId(merch_id);
	}
	/**
	 * 根据商品ID查询商品信息
	 * @param merch_id 商品ID
	 * @return
	 */
	public Merch queryMerchById(String merch_id){
		return this.merchMapper.queryMerchById(merch_id);
	}
	/**
	 * 根据商家ID查询商品信息
	 * @param store_id 商家ID
	 * @return
	 */
	public List<Merch> queryMerchByStoreId(String store_id){
		return this.merchMapper.queryMerchByStoreId(store_id);
	}
	/**
	 * 根据用户ID查询商品信息
	 * @param user_id 用户ID
	 * @return
	 */
	public List<Merch> queryMerchByUserId(String user_id){
		return this.merchMapper.queryMerchByUserId(user_id);
	}

	/**
	 * 根据输入的条件（包括用户ID、是否下架、分类等）查询商品信息
	 * @param merch 商品信息
	 * @return
	 */
	@Override
	public List<Merch> queryMerchBy(Merch merch) {
		return this.merchMapper.queryMerchBy(merch);
	}
	
	/**
	 * 批量更新商品信息
	 * @param merchList 商品列表
	 * @return 更新状态
	 */
	@Override
	public void updateMerchBatch(List<Merch> merchList) {
		this.merchMapper.updateMerchBatch(merchList);
	}
}
