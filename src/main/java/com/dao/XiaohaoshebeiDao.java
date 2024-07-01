package com.dao;

import com.entity.XiaohaoshebeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaohaoshebeiVO;
import com.entity.view.XiaohaoshebeiView;


/**
 * 消耗设备
 * 
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
public interface XiaohaoshebeiDao extends BaseMapper<XiaohaoshebeiEntity> {
	
	List<XiaohaoshebeiVO> selectListVO(@Param("ew") Wrapper<XiaohaoshebeiEntity> wrapper);
	
	XiaohaoshebeiVO selectVO(@Param("ew") Wrapper<XiaohaoshebeiEntity> wrapper);
	
	List<XiaohaoshebeiView> selectListView(@Param("ew") Wrapper<XiaohaoshebeiEntity> wrapper);

	List<XiaohaoshebeiView> selectListView(Pagination page,@Param("ew") Wrapper<XiaohaoshebeiEntity> wrapper);
	
	XiaohaoshebeiView selectView(@Param("ew") Wrapper<XiaohaoshebeiEntity> wrapper);
	
}
