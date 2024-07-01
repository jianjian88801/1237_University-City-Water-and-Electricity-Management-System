package com.entity.model;

import com.entity.WeihubaoyangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 维护保养
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
public class WeihubaoyangModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 设备名称
	 */
	
	private String shebeimingcheng;
		
	/**
	 * 维护人员
	 */
	
	private String weihurenyuan;
		
	/**
	 * 维护内容
	 */
	
	private String weihuneirong;
		
	/**
	 * 维护日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date weihuriqi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：设备名称
	 */
	 
	public void setShebeimingcheng(String shebeimingcheng) {
		this.shebeimingcheng = shebeimingcheng;
	}
	
	/**
	 * 获取：设备名称
	 */
	public String getShebeimingcheng() {
		return shebeimingcheng;
	}
				
	
	/**
	 * 设置：维护人员
	 */
	 
	public void setWeihurenyuan(String weihurenyuan) {
		this.weihurenyuan = weihurenyuan;
	}
	
	/**
	 * 获取：维护人员
	 */
	public String getWeihurenyuan() {
		return weihurenyuan;
	}
				
	
	/**
	 * 设置：维护内容
	 */
	 
	public void setWeihuneirong(String weihuneirong) {
		this.weihuneirong = weihuneirong;
	}
	
	/**
	 * 获取：维护内容
	 */
	public String getWeihuneirong() {
		return weihuneirong;
	}
				
	
	/**
	 * 设置：维护日期
	 */
	 
	public void setWeihuriqi(Date weihuriqi) {
		this.weihuriqi = weihuriqi;
	}
	
	/**
	 * 获取：维护日期
	 */
	public Date getWeihuriqi() {
		return weihuriqi;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
