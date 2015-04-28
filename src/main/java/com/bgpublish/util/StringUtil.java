/**
 * 
 */
package com.bgpublish.util;

/**
 * 字符串工具类
 * @author ps
 *
 */
public class StringUtil {
	
	/**
	 * 截取source两边的空格
	 * 若字符串为null，即为""
	 * @param source 原字符串
	 * @return 
	 */
	public static String trim(String source){
		if(source == null){
			return "";
		}
		
		return source.trim();
	}
	
	
}
