package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BanzubaobiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BanzubaobiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BanzubaobiaoView;


/**
 * 班组报表
 *
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
public interface BanzubaobiaoService extends IService<BanzubaobiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BanzubaobiaoVO> selectListVO(Wrapper<BanzubaobiaoEntity> wrapper);
   	
   	BanzubaobiaoVO selectVO(@Param("ew") Wrapper<BanzubaobiaoEntity> wrapper);
   	
   	List<BanzubaobiaoView> selectListView(Wrapper<BanzubaobiaoEntity> wrapper);
   	
   	BanzubaobiaoView selectView(@Param("ew") Wrapper<BanzubaobiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BanzubaobiaoEntity> wrapper);
   	
}

