package com.entity.view;

import com.entity.LingyongbaobiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 领用报表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
@TableName("lingyongbaobiao")
public class LingyongbaobiaoView  extends LingyongbaobiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LingyongbaobiaoView(){
	}
 
 	public LingyongbaobiaoView(LingyongbaobiaoEntity lingyongbaobiaoEntity){
 	try {
			BeanUtils.copyProperties(this, lingyongbaobiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
