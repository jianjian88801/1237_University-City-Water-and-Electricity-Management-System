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
 * 设备检测
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
@TableName("shebeijiance")
public class ShebeijianceEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShebeijianceEntity() {
		
	}
	
	public ShebeijianceEntity(T t) {
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
	 * 检测单号
	 */
					
	private String jiancedanhao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date jianceriqi;
	
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
	 * 设置：检测单号
	 */
	public void setJiancedanhao(String jiancedanhao) {
		this.jiancedanhao = jiancedanhao;
	}
	/**
	 * 获取：检测单号
	 */
	public String getJiancedanhao() {
		return jiancedanhao;
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
