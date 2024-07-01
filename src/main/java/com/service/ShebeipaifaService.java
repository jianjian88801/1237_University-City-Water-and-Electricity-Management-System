package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShebeipaifaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShebeipaifaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShebeipaifaView;


/**
 * 设备派发
 *
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
public interface ShebeipaifaService extends IService<ShebeipaifaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShebeipaifaVO> selectListVO(Wrapper<ShebeipaifaEntity> wrapper);
   	
   	ShebeipaifaVO selectVO(@Param("ew") Wrapper<ShebeipaifaEntity> wrapper);
   	
   	List<ShebeipaifaView> selectListView(Wrapper<ShebeipaifaEntity> wrapper);
   	
   	ShebeipaifaView selectView(@Param("ew") Wrapper<ShebeipaifaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShebeipaifaEntity> wrapper);
   	
}

