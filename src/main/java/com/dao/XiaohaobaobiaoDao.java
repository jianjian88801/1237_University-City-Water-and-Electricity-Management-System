package com.dao;

import com.entity.XiaohaobaobiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaohaobaobiaoVO;
import com.entity.view.XiaohaobaobiaoView;


/**
 * 消耗报表
 * 
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
public interface XiaohaobaobiaoDao extends BaseMapper<XiaohaobaobiaoEntity> {
	
	List<XiaohaobaobiaoVO> selectListVO(@Param("ew") Wrapper<XiaohaobaobiaoEntity> wrapper);
	
	XiaohaobaobiaoVO selectVO(@Param("ew") Wrapper<XiaohaobaobiaoEntity> wrapper);
	
	List<XiaohaobaobiaoView> selectListView(@Param("ew") Wrapper<XiaohaobaobiaoEntity> wrapper);

	List<XiaohaobaobiaoView> selectListView(Pagination page,@Param("ew") Wrapper<XiaohaobaobiaoEntity> wrapper);
	
	XiaohaobaobiaoView selectView(@Param("ew") Wrapper<XiaohaobaobiaoEntity> wrapper);
	
}
