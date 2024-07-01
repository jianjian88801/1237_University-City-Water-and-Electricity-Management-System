package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LingyongbaobiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LingyongbaobiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LingyongbaobiaoView;


/**
 * 领用报表
 *
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
public interface LingyongbaobiaoService extends IService<LingyongbaobiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LingyongbaobiaoVO> selectListVO(Wrapper<LingyongbaobiaoEntity> wrapper);
   	
   	LingyongbaobiaoVO selectVO(@Param("ew") Wrapper<LingyongbaobiaoEntity> wrapper);
   	
   	List<LingyongbaobiaoView> selectListView(Wrapper<LingyongbaobiaoEntity> wrapper);
   	
   	LingyongbaobiaoView selectView(@Param("ew") Wrapper<LingyongbaobiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LingyongbaobiaoEntity> wrapper);
   	
}

