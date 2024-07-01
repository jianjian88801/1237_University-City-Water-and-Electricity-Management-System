package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DingqixiufuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DingqixiufuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DingqixiufuView;


/**
 * 定期修复
 *
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
public interface DingqixiufuService extends IService<DingqixiufuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DingqixiufuVO> selectListVO(Wrapper<DingqixiufuEntity> wrapper);
   	
   	DingqixiufuVO selectVO(@Param("ew") Wrapper<DingqixiufuEntity> wrapper);
   	
   	List<DingqixiufuView> selectListView(Wrapper<DingqixiufuEntity> wrapper);
   	
   	DingqixiufuView selectView(@Param("ew") Wrapper<DingqixiufuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DingqixiufuEntity> wrapper);
   	
}

