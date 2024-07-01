package com.entity.vo;

import com.entity.BanzubaobiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 班组报表
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
public class BanzubaobiaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 月份
	 */
	
	private String yuefen;
		
	/**
	 * 领用设备
	 */
	
	private Integer lingyongshebei;
		
	/**
	 * 消耗设备
	 */
	
	private Integer xiaohaoshebei;
		
	/**
	 * 总数量
	 */
	
	private Integer zongshuliang;
		
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
	 * 设置：领用设备
	 */
	 
	public void setLingyongshebei(Integer lingyongshebei) {
		this.lingyongshebei = lingyongshebei;
	}
	
	/**
	 * 获取：领用设备
	 */
	public Integer getLingyongshebei() {
		return lingyongshebei;
	}
				
	
	/**
	 * 设置：消耗设备
	 */
	 
	public void setXiaohaoshebei(Integer xiaohaoshebei) {
		this.xiaohaoshebei = xiaohaoshebei;
	}
	
	/**
	 * 获取：消耗设备
	 */
	public Integer getXiaohaoshebei() {
		return xiaohaoshebei;
	}
				
	
	/**
	 * 设置：总数量
	 */
	 
	public void setZongshuliang(Integer zongshuliang) {
		this.zongshuliang = zongshuliang;
	}
	
	/**
	 * 获取：总数量
	 */
	public Integer getZongshuliang() {
		return zongshuliang;
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
