package com.entity.view;

import com.entity.WeihubaoyangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 维护保养
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
@TableName("weihubaoyang")
public class WeihubaoyangView  extends WeihubaoyangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WeihubaoyangView(){
	}
 
 	public WeihubaoyangView(WeihubaoyangEntity weihubaoyangEntity){
 	try {
			BeanUtils.copyProperties(this, weihubaoyangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
