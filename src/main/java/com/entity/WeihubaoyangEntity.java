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
 * 维护保养
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
@TableName("weihubaoyang")
public class WeihubaoyangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WeihubaoyangEntity() {
		
	}
	
	public WeihubaoyangEntity(T t) {
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
	 * 维护单号
	 */
					
	private String weihudanhao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date weihuriqi;
	
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
	 * 设置：维护单号
	 */
	public void setWeihudanhao(String weihudanhao) {
		this.weihudanhao = weihudanhao;
	}
	/**
	 * 获取：维护单号
	 */
	public String getWeihudanhao() {
		return weihudanhao;
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
