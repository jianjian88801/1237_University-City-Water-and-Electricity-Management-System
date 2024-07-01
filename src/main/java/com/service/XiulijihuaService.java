package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiulijihuaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiulijihuaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiulijihuaView;


/**
 * 修理计划
 *
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
public interface XiulijihuaService extends IService<XiulijihuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiulijihuaVO> selectListVO(Wrapper<XiulijihuaEntity> wrapper);
   	
   	XiulijihuaVO selectVO(@Param("ew") Wrapper<XiulijihuaEntity> wrapper);
   	
   	List<XiulijihuaView> selectListView(Wrapper<XiulijihuaEntity> wrapper);
   	
   	XiulijihuaView selectView(@Param("ew") Wrapper<XiulijihuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiulijihuaEntity> wrapper);
   	
}

