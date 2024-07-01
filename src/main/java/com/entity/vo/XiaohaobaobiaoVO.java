package com.entity.vo;

import com.entity.XiaohaobaobiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 消耗报表
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
public class XiaohaobaobiaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 月份
	 */
	
	private String yuefen;
		
	/**
	 * 设备名称
	 */
	
	private String shebeimingcheng;
		
	/**
	 * 消耗数量
	 */
	
	private Integer xiaohaoshuliang;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
				
	
	/**
	 * 设置：月份
	 */
	 
	public void setYuefen(String yuefen) {
		this.yuefen = yuefen;
	}
	
	/**
	 * 获取：月份
	 */
	public String getYuefen() {
		return yuefen;
	}
				
	
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
	 * 设置：消耗数量
	 */
	 
	public void setXiaohaoshuliang(Integer xiaohaoshuliang) {
		this.xiaohaoshuliang = xiaohaoshuliang;
	}
	
	/**
	 * 获取：消耗数量
	 */
	public Integer getXiaohaoshuliang() {
		return xiaohaoshuliang;
	}
				
	
	/**
	 * 设置：登记日期
	 */
	 
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
	}
			
}
