package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuangtaihuibaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuangtaihuibaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuangtaihuibaoView;


/**
 * 状态汇报
 *
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
public interface ZhuangtaihuibaoService extends IService<ZhuangtaihuibaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuangtaihuibaoVO> selectListVO(Wrapper<ZhuangtaihuibaoEntity> wrapper);
   	
   	ZhuangtaihuibaoVO selectVO(@Param("ew") Wrapper<ZhuangtaihuibaoEntity> wrapper);
   	
   	List<ZhuangtaihuibaoView> selectListView(Wrapper<ZhuangtaihuibaoEntity> wrapper);
   	
   	ZhuangtaihuibaoView selectView(@Param("ew") Wrapper<ZhuangtaihuibaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuangtaihuibaoEntity> wrapper);
   	
}

