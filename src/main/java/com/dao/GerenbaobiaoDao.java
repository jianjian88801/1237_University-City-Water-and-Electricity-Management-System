package com.dao;

import com.entity.GerenbaobiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GerenbaobiaoVO;
import com.entity.view.GerenbaobiaoView;


/**
 * 个人报表
 * 
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
public interface GerenbaobiaoDao extends BaseMapper<GerenbaobiaoEntity> {
	
	List<GerenbaobiaoVO> selectListVO(@Param("ew") Wrapper<GerenbaobiaoEntity> wrapper);
	
	GerenbaobiaoVO selectVO(@Param("ew") Wrapper<GerenbaobiaoEntity> wrapper);
	
	List<GerenbaobiaoView> selectListView(@Param("ew") Wrapper<GerenbaobiaoEntity> wrapper);

	List<GerenbaobiaoView> selectListView(Pagination page,@Param("ew") Wrapper<GerenbaobiaoEntity> wrapper);
	
	GerenbaobiaoView selectView(@Param("ew") Wrapper<GerenbaobiaoEntity> wrapper);
	
}
