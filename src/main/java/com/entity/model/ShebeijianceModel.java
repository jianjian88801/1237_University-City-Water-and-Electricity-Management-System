package com.entity.model;

import com.entity.ShebeijianceEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 设备检测
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
public class ShebeijianceModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 设备名称
	 */
	
	private String shebeimingcheng;
		
	/**
	 * 检测人员
	 */
	
	private String jiancerenyuan;
		
	/**
	 * 检测内容
	 */
	
	private String jianceneirong;
		
	/**
	 * 检测日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jianceriqi;
		
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
	 * 设置：检测人员
	 */
	 
	public void setJiancerenyuan(String jiancerenyuan) {
		this.jiancerenyuan = jiancerenyuan;
	}
	
	/**
	 * 获取：检测人员
	 */
	public String getJiancerenyuan() {
		return jiancerenyuan;
	}
				
	
	/**
	 * 设置：检测内容
	 */
	 
	public void setJianceneirong(String jianceneirong) {
		this.jianceneirong = jianceneirong;
	}
	
	/**
	 * 获取：检测内容
	 */
	public String getJianceneirong() {
		return jianceneirong;
	}
				
	
	/**
	 * 设置：检测日期
	 */
	 
	public void setJianceriqi(Date jianceriqi) {
		this.jianceriqi = jianceriqi;
	}
	
	/**
	 * 获取：检测日期
	 */
	public Date getJianceriqi() {
		return jianceriqi;
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
