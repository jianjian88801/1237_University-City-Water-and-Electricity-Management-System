package com.entity.vo;

import com.entity.XiulijihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 修理计划
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
public class XiulijihuaVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 修理内容
	 */
	
	private String xiulineirong;
		
	/**
	 * 计划时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jihuashijian;
		
	/**
	 * 操作人
	 */
	
	private String caozuoren;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：修理内容
	 */
	 
	public void setXiulineirong(String xiulineirong) {
		this.xiulineirong = xiulineirong;
	}
	
	/**
	 * 获取：修理内容
	 */
	public String getXiulineirong() {
		return xiulineirong;
	}
				
	
	/**
	 * 设置：计划时间
	 */
	 
	public void setJihuashijian(Date jihuashijian) {
		this.jihuashijian = jihuashijian;
	}
	
	/**
	 * 获取：计划时间
	 */
	public Date getJihuashijian() {
		return jihuashijian;
	}
				
	
	/**
	 * 设置：操作人
	 */
	 
	public void setCaozuoren(String caozuoren) {
		this.caozuoren = caozuoren;
	}
	
	/**
	 * 获取：操作人
	 */
	public String getCaozuoren() {
		return caozuoren;
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
