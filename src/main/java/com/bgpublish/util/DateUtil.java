package com.bgpublish.util;

import java.util.Calendar;

import org.apache.commons.lang.time.DateFormatUtils;

/**
 * 日期处理工具类 
 * @author ps
 * @since 1.0
 */
public class DateUtil {
	
	/**
	 * 获取当前日期，默认格式为yyyyMMdd
	 * @return 当前日期
	 */
	public static String today(){
		return today("yyyyMMdd");
	}

	/**
	 * 获取当前日期
	 * @param format 日期格式
	 * @return 当前日期
	 */
	public static String today(String format){
		return DateFormatUtils.format(Calendar.getInstance(), format);
	}

	/**
	 * 获取当前日期时间，默认格式为yyyyMMddHHmmss
	 * @return 当前日期时间
	 */
	public static String currentTime(){
		return today("yyyyMMddHHmmss");
	}
	
}