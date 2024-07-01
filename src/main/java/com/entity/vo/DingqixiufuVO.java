package com.entity.vo;

import com.entity.DingqixiufuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 定期修复
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
public class DingqixiufuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 设备名称
	 */
	
	private String shebeimingcheng;
		
	/**
	 * 修复人员
	 */
	
	private String xiufurenyuan;
		
	/**
	 * 修复内容
	 */
	
	private String xiufuneirong;
		
	/**
	 * 定期日期
	 */
	
	private String dingqiriqi;
		
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
	 * 设置：修复人员
	 */
	 
	public void setXiufurenyuan(String xiufurenyuan) {
		this.xiufurenyuan = xiufurenyuan;
	}
	
	/**
	 * 获取：修复人员
	 */
	public String getXiufurenyuan() {
		return xiufurenyuan;
	}
				
	
	/**
	 * 设置：修复内容
	 */
	 
	public void setXiufuneirong(String xiufuneirong) {
		this.xiufuneirong = xiufuneirong;
	}
	
	/**
	 * 获取：修复内容
	 */
	public String getXiufuneirong() {
		return xiufuneirong;
	}
				
	
	/**
	 * 设置：定期日期
	 */
	 
	public void setDingqiriqi(String dingqiriqi) {
		this.dingqiriqi = dingqiriqi;
	}
	
	/**
	 * 获取：定期日期
	 */
	public String getDingqiriqi() {
		return dingqiriqi;
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
