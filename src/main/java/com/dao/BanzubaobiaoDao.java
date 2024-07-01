package com.dao;

import com.entity.BanzubaobiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BanzubaobiaoVO;
import com.entity.view.BanzubaobiaoView;


/**
 * 班组报表
 * 
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
public interface BanzubaobiaoDao extends BaseMapper<BanzubaobiaoEntity> {
	
	List<BanzubaobiaoVO> selectListVO(@Param("ew") Wrapper<BanzubaobiaoEntity> wrapper);
	
	BanzubaobiaoVO selectVO(@Param("ew") Wrapper<BanzubaobiaoEntity> wrapper);
	
	List<BanzubaobiaoView> selectListView(@Param("ew") Wrapper<BanzubaobiaoEntity> wrapper);

	List<BanzubaobiaoView> selectListView(Pagination page,@Param("ew") Wrapper<BanzubaobiaoEntity> wrapper);
	
	BanzubaobiaoView selectView(@Param("ew") Wrapper<BanzubaobiaoEntity> wrapper);
	
}
