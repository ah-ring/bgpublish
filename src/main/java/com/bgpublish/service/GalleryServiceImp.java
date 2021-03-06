/**
 * 
 */
package com.bgpublish.service;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bgpublish.domain.Gallery;
import com.bgpublish.mapper.GalleryMapper;

/**
 * 图片服务接口实现类
 * @author ps
 *
 */
@Service
public class GalleryServiceImp implements GalleryService {

	private @Autowired @Setter @Getter GalleryMapper galleryMapper;

	/**
	 * 新增图片信息
	 * @param gallery 图片信息
	 */
	public void addGallery(Gallery gallery){
		this.galleryMapper.addGallery(gallery);
	}
	/**
	 * 删除图片信息
	 * @param gallery 图片信息
	 */
	public void deleteGallery(String gallery_id){
		this.galleryMapper.deleteGallery(gallery_id);
	}
	/**
	 * 更新图片信息
	 * @param gallery 图片信息
	 */
	public void updateGallery(Gallery gallery){
		this.galleryMapper.updateGallery(gallery);
	}
	/**
	 * 根据图片ID查询图片信息
	 * @param gallery_id 图片ID
	 * @return
	 */
	public Gallery queryById(String gallery_id){
		return this.galleryMapper.queryById(gallery_id);
	}
	/**
	 * 根据商品ID查询图片信息
	 * @param merch_id 商品ID
	 * @return
	 */
	public List<Gallery> queryByMerchId(String merch_id){
		return this.galleryMapper.queryByMerchId(merch_id);
	}
}
