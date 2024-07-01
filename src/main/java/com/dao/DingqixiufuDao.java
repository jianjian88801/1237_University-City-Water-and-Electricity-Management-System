package com.dao;

import com.entity.DingqixiufuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DingqixiufuVO;
import com.entity.view.DingqixiufuView;


/**
 * 定期修复
 * 
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
public interface DingqixiufuDao extends BaseMapper<DingqixiufuEntity> {
	
	List<DingqixiufuVO> selectListVO(@Param("ew") Wrapper<DingqixiufuEntity> wrapper);
	
	DingqixiufuVO selectVO(@Param("ew") Wrapper<DingqixiufuEntity> wrapper);
	
	List<DingqixiufuView> selectListView(@Param("ew") Wrapper<DingqixiufuEntity> wrapper);

	List<DingqixiufuView> selectListView(Pagination page,@Param("ew") Wrapper<DingqixiufuEntity> wrapper);
	
	DingqixiufuView selectView(@Param("ew") Wrapper<DingqixiufuEntity> wrapper);
	
}
