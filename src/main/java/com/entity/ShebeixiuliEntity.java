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
 * 设备修理
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
@TableName("shebeixiuli")
public class ShebeixiuliEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShebeixiuliEntity() {
		
	}
	
	public ShebeixiuliEntity(T t) {
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
	 * 修理单号
	 */
					
	private String xiulidanhao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date xiuliriqi;
	
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
	 * 设置：修理单号
	 */
	public void setXiulidanhao(String xiulidanhao) {
		this.xiulidanhao = xiulidanhao;
	}
	/**
	 * 获取：修理单号
	 */
	public String getXiulidanhao() {
		return xiulidanhao;
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
