package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShebeijianceEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShebeijianceVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShebeijianceView;


/**
 * 设备检测
 *
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
public interface ShebeijianceService extends IService<ShebeijianceEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShebeijianceVO> selectListVO(Wrapper<ShebeijianceEntity> wrapper);
   	
   	ShebeijianceVO selectVO(@Param("ew") Wrapper<ShebeijianceEntity> wrapper);
   	
   	List<ShebeijianceView> selectListView(Wrapper<ShebeijianceEntity> wrapper);
   	
   	ShebeijianceView selectView(@Param("ew") Wrapper<ShebeijianceEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShebeijianceEntity> wrapper);
   	
}

