package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShebeixiuliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShebeixiuliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShebeixiuliView;


/**
 * 设备修理
 *
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
public interface ShebeixiuliService extends IService<ShebeixiuliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShebeixiuliVO> selectListVO(Wrapper<ShebeixiuliEntity> wrapper);
   	
   	ShebeixiuliVO selectVO(@Param("ew") Wrapper<ShebeixiuliEntity> wrapper);
   	
   	List<ShebeixiuliView> selectListView(Wrapper<ShebeixiuliEntity> wrapper);
   	
   	ShebeixiuliView selectView(@Param("ew") Wrapper<ShebeixiuliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShebeixiuliEntity> wrapper);
   	
}

