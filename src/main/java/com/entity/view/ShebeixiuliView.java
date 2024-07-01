package com.entity.view;

import com.entity.ShebeixiuliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 设备修理
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
@TableName("shebeixiuli")
public class ShebeixiuliView  extends ShebeixiuliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShebeixiuliView(){
	}
 
 	public ShebeixiuliView(ShebeixiuliEntity shebeixiuliEntity){
 	try {
			BeanUtils.copyProperties(this, shebeixiuliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
