package com.bgpublish.service;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bgpublish.domain.FrequentlyAddress;
import com.bgpublish.mapper.FrequentlyAddressMapper;

/**
 * 常用地址服务接口实现类
 * @author ps
 *
 */
@Service
public class FrequentlyAddressServiceImp implements FrequentlyAddressService{
	
	private @Autowired @Setter @Getter FrequentlyAddressMapper frequentlyAddressMapper;
	/**
	 * 新增常用地址
	 * @param frequentlyAddress 常用地址
	 */
	public void addFrequentlyAddress(FrequentlyAddress frequentlyAddress){
		this.frequentlyAddressMapper.addFrequentlyAddress(frequentlyAddress);
	}
	/**
	 * 删除常用地址
	 * @param frequentlyAddress 常用地址
	 */
	public void deleteFrequentlyAddressById(String freqa_id){
		this.frequentlyAddressMapper.deleteFrequentlyAddressById(freqa_id);
	}
	/**
	 * 更新常用地址
	 * @param frequentlyAddress 常用地址
	 */
	public void updateFrequentlyAddress(FrequentlyAddress frequentlyAddress){
		this.frequentlyAddressMapper.updateFrequentlyAddress(frequentlyAddress);
	}
	/**
	 * 根据用户ID查询该用户下所有常用地址
	 * @param user_id 用户ID
	 * @return
	 */
	public List<FrequentlyAddress> queryByUserId(String user_id){
		return this.frequentlyAddressMapper.queryByUserId(user_id);
	}
	
}
