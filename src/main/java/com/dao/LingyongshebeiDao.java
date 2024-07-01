package com.dao;

import com.entity.LingyongshebeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LingyongshebeiVO;
import com.entity.view.LingyongshebeiView;


/**
 * 领用设备
 * 
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
public interface LingyongshebeiDao extends BaseMapper<LingyongshebeiEntity> {
	
	List<LingyongshebeiVO> selectListVO(@Param("ew") Wrapper<LingyongshebeiEntity> wrapper);
	
	LingyongshebeiVO selectVO(@Param("ew") Wrapper<LingyongshebeiEntity> wrapper);
	
	List<LingyongshebeiView> selectListView(@Param("ew") Wrapper<LingyongshebeiEntity> wrapper);

	List<LingyongshebeiView> selectListView(Pagination page,@Param("ew") Wrapper<LingyongshebeiEntity> wrapper);
	
	LingyongshebeiView selectView(@Param("ew") Wrapper<LingyongshebeiEntity> wrapper);
	
}
