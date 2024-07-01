package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaohaobaobiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaohaobaobiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaohaobaobiaoView;


/**
 * 消耗报表
 *
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
public interface XiaohaobaobiaoService extends IService<XiaohaobaobiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaohaobaobiaoVO> selectListVO(Wrapper<XiaohaobaobiaoEntity> wrapper);
   	
   	XiaohaobaobiaoVO selectVO(@Param("ew") Wrapper<XiaohaobaobiaoEntity> wrapper);
   	
   	List<XiaohaobaobiaoView> selectListView(Wrapper<XiaohaobaobiaoEntity> wrapper);
   	
   	XiaohaobaobiaoView selectView(@Param("ew") Wrapper<XiaohaobaobiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaohaobaobiaoEntity> wrapper);
   	
}

