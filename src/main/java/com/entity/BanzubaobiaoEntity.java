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
 * 班组报表
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
@TableName("banzubaobiao")
public class BanzubaobiaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BanzubaobiaoEntity() {
		
	}
	
	public BanzubaobiaoEntity(T t) {
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date dengjiriqi;
	
	
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
