package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GerenbaobiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GerenbaobiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GerenbaobiaoView;


/**
 * 个人报表
 *
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
public interface GerenbaobiaoService extends IService<GerenbaobiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GerenbaobiaoVO> selectListVO(Wrapper<GerenbaobiaoEntity> wrapper);
   	
   	GerenbaobiaoVO selectVO(@Param("ew") Wrapper<GerenbaobiaoEntity> wrapper);
   	
   	List<GerenbaobiaoView> selectListView(Wrapper<GerenbaobiaoEntity> wrapper);
   	
   	GerenbaobiaoView selectView(@Param("ew") Wrapper<GerenbaobiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GerenbaobiaoEntity> wrapper);
   	
}

