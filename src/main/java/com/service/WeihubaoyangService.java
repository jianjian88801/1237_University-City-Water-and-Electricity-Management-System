package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeihubaoyangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WeihubaoyangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WeihubaoyangView;


/**
 * 维护保养
 *
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
public interface WeihubaoyangService extends IService<WeihubaoyangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeihubaoyangVO> selectListVO(Wrapper<WeihubaoyangEntity> wrapper);
   	
   	WeihubaoyangVO selectVO(@Param("ew") Wrapper<WeihubaoyangEntity> wrapper);
   	
   	List<WeihubaoyangView> selectListView(Wrapper<WeihubaoyangEntity> wrapper);
   	
   	WeihubaoyangView selectView(@Param("ew") Wrapper<WeihubaoyangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeihubaoyangEntity> wrapper);
   	
}

