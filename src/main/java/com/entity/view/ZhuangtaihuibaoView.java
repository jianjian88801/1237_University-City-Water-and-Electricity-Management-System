package com.entity.view;

import com.entity.ZhuangtaihuibaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 状态汇报
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
@TableName("zhuangtaihuibao")
public class ZhuangtaihuibaoView  extends ZhuangtaihuibaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhuangtaihuibaoView(){
	}
 
 	public ZhuangtaihuibaoView(ZhuangtaihuibaoEntity zhuangtaihuibaoEntity){
 	try {
			BeanUtils.copyProperties(this, zhuangtaihuibaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
