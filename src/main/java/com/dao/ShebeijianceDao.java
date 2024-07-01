package com.dao;

import com.entity.ShebeijianceEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShebeijianceVO;
import com.entity.view.ShebeijianceView;


/**
 * 设备检测
 * 
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
public interface ShebeijianceDao extends BaseMapper<ShebeijianceEntity> {
	
	List<ShebeijianceVO> selectListVO(@Param("ew") Wrapper<ShebeijianceEntity> wrapper);
	
	ShebeijianceVO selectVO(@Param("ew") Wrapper<ShebeijianceEntity> wrapper);
	
	List<ShebeijianceView> selectListView(@Param("ew") Wrapper<ShebeijianceEntity> wrapper);

	List<ShebeijianceView> selectListView(Pagination page,@Param("ew") Wrapper<ShebeijianceEntity> wrapper);
	
	ShebeijianceView selectView(@Param("ew") Wrapper<ShebeijianceEntity> wrapper);
	
}
