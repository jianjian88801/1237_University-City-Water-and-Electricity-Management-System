package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 定期修复
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
@TableName("dingqixiufu")
public class DingqixiufuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DingqixiufuEntity() {
		
	}
	
	public DingqixiufuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 编号
	 */
					
	private String bianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：编号
	 */
	public void setBianhao(String bianhao) {
		this.bianhao = bianhao;
	}
	/**
	 * 获取：编号
	 */
	public String getBianhao() {
		return bianhao;
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
