/**
 * 
 */
package com.bgpublish.web;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bgpublish.domain.FrequentlyAddress;
import com.bgpublish.service.FrequentlyAddressService;
import com.bgpublish.util.HttpUtil;

/**
 * 常用地址Web Controller
 * 
 * @author pansen
 *
 */
@RestController
@RequestMapping(value="/sgams/freqa")
public class FrequentlyAddressController {

	private @Autowired @Getter @Setter FrequentlyAddressService frequentlyAddressService;
	
	
	@RequestMapping(value="/query.do", method = RequestMethod.GET)
	@ResponseBody
	public List<FrequentlyAddress> queryFrequentlyAddressService(String user_id){
		List<FrequentlyAddress> list = this.frequentlyAddressService.queryByUserId(user_id);
		
		return list;
	}
	
	@RequestMapping(value="/add.do", method = RequestMethod.POST)
	public ResponseEntity<String> addFrequentlyAddress(@RequestBody FrequentlyAddress frequentlyAddress){
		try{
			this.frequentlyAddressService.addFrequentlyAddress(frequentlyAddress);
		}catch(Exception e){
			e.printStackTrace();
			return HttpUtil.createResponseEntity("新增常用地址失败!", HttpStatus.BAD_REQUEST);
		}
		
		return HttpUtil.createResponseEntity("新增常用地址成功!", HttpStatus.OK);
	}
	
	@RequestMapping(value="/delete.do", method = RequestMethod.GET)
	public ResponseEntity<String> deleteFrequentlyAddressById(String freqa_id){
		try{
			this.frequentlyAddressService.deleteFrequentlyAddressById(freqa_id);
		}catch(Exception e){
			e.printStackTrace();
			return HttpUtil.createResponseEntity("删除常用地址失败!", HttpStatus.BAD_REQUEST);
		}
		
		return HttpUtil.createResponseEntity("删除常用地址成功!", HttpStatus.OK);
	}
	
	@RequestMapping(value="/update.do", method = RequestMethod.POST)
	public ResponseEntity<String> updateFrequentlyAddress(@RequestBody FrequentlyAddress frequentlyAddress){
		try{
			this.frequentlyAddressService.updateFrequentlyAddress(frequentlyAddress);
		}catch(Exception e){
			e.printStackTrace();
			return HttpUtil.createResponseEntity("更新常用地址失败!", HttpStatus.BAD_REQUEST);
		}
		
		return HttpUtil.createResponseEntity("更新常用地址成功!", HttpStatus.OK);
	}
}
