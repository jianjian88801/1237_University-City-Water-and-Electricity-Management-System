package com.entity.view;

import com.entity.LingyongshebeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 领用设备
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
@TableName("lingyongshebei")
public class LingyongshebeiView  extends LingyongshebeiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LingyongshebeiView(){
	}
 
 	public LingyongshebeiView(LingyongshebeiEntity lingyongshebeiEntity){
 	try {
			BeanUtils.copyProperties(this, lingyongshebeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
