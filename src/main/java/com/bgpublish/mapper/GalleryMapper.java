/**
 * 
 */
package com.bgpublish.mapper;

import java.util.List;

import com.bgpublish.domain.Gallery;

/**
 * 图片Mapper
 * @author ps
 *
 */
public interface GalleryMapper {
	/**
	 * 新增图片信息
	 * @param gallery 图片信息
	 */
	public void addGallery(Gallery gallery);
	/**
	 * 删除图片信息
	 * @param gallery 图片ID
	 */
	public void deleteGallery(String gallery_id);
	/**
	 * 更新图片信息
	 * @param gallery 图片信息
	 */
	public void updateGallery(Gallery gallery);
	/**
	 * 根据图片ID查询图片信息
	 * @param gallery_id 图片ID
	 * @return
	 */
	public Gallery queryById(String gallery_id);
	/**
	 * 根据商品ID查询图片信息
	 * @param merch_id 商品ID
	 * @return
	 */
	public List<Gallery> queryByMerchId(String merch_id);
}
