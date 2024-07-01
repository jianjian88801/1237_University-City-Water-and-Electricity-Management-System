package com.dao;

import com.entity.WeihubaoyangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WeihubaoyangVO;
import com.entity.view.WeihubaoyangView;


/**
 * 维护保养
 * 
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
public interface WeihubaoyangDao extends BaseMapper<WeihubaoyangEntity> {
	
	List<WeihubaoyangVO> selectListVO(@Param("ew") Wrapper<WeihubaoyangEntity> wrapper);
	
	WeihubaoyangVO selectVO(@Param("ew") Wrapper<WeihubaoyangEntity> wrapper);
	
	List<WeihubaoyangView> selectListView(@Param("ew") Wrapper<WeihubaoyangEntity> wrapper);

	List<WeihubaoyangView> selectListView(Pagination page,@Param("ew") Wrapper<WeihubaoyangEntity> wrapper);
	
	WeihubaoyangView selectView(@Param("ew") Wrapper<WeihubaoyangEntity> wrapper);
	
}
