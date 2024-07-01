package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaohaoshebeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaohaoshebeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaohaoshebeiView;


/**
 * 消耗设备
 *
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
public interface XiaohaoshebeiService extends IService<XiaohaoshebeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaohaoshebeiVO> selectListVO(Wrapper<XiaohaoshebeiEntity> wrapper);
   	
   	XiaohaoshebeiVO selectVO(@Param("ew") Wrapper<XiaohaoshebeiEntity> wrapper);
   	
   	List<XiaohaoshebeiView> selectListView(Wrapper<XiaohaoshebeiEntity> wrapper);
   	
   	XiaohaoshebeiView selectView(@Param("ew") Wrapper<XiaohaoshebeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaohaoshebeiEntity> wrapper);
   	
}

