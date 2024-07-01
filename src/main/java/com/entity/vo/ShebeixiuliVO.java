package com.entity.vo;

import com.entity.ShebeixiuliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 设备修理
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
public class ShebeixiuliVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 设备名称
	 */
	
	private String shebeimingcheng;
		
	/**
	 * 修理人员
	 */
	
	private String xiulirenyuan;
		
	/**
	 * 问题描述
	 */
	
	private String wentimiaoshu;
		
	/**
	 * 修理日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date xiuliriqi;
		
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
	 * 设置：修理人员
	 */
	 
	public void setXiulirenyuan(String xiulirenyuan) {
		this.xiulirenyuan = xiulirenyuan;
	}
	
	/**
	 * 获取：修理人员
	 */
	public String getXiulirenyuan() {
		return xiulirenyuan;
	}
				
	
	/**
	 * 设置：问题描述
	 */
	 
	public void setWentimiaoshu(String wentimiaoshu) {
		this.wentimiaoshu = wentimiaoshu;
	}
	
	/**
	 * 获取：问题描述
	 */
	public String getWentimiaoshu() {
		return wentimiaoshu;
	}
				
	
	/**
	 * 设置：修理日期
	 */
	 
	public void setXiuliriqi(Date xiuliriqi) {
		this.xiuliriqi = xiuliriqi;
	}
	
	/**
	 * 获取：修理日期
	 */
	public Date getXiuliriqi() {
		return xiuliriqi;
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
