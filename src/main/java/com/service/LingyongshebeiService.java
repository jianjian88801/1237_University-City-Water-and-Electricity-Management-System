package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LingyongshebeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LingyongshebeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LingyongshebeiView;


/**
 * 领用设备
 *
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
public interface LingyongshebeiService extends IService<LingyongshebeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LingyongshebeiVO> selectListVO(Wrapper<LingyongshebeiEntity> wrapper);
   	
   	LingyongshebeiVO selectVO(@Param("ew") Wrapper<LingyongshebeiEntity> wrapper);
   	
   	List<LingyongshebeiView> selectListView(Wrapper<LingyongshebeiEntity> wrapper);
   	
   	LingyongshebeiView selectView(@Param("ew") Wrapper<LingyongshebeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LingyongshebeiEntity> wrapper);
   	
}

