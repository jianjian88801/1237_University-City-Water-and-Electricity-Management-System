package com.dao;

import com.entity.ShebeixiuliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShebeixiuliVO;
import com.entity.view.ShebeixiuliView;


/**
 * 设备修理
 * 
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
public interface ShebeixiuliDao extends BaseMapper<ShebeixiuliEntity> {
	
	List<ShebeixiuliVO> selectListVO(@Param("ew") Wrapper<ShebeixiuliEntity> wrapper);
	
	ShebeixiuliVO selectVO(@Param("ew") Wrapper<ShebeixiuliEntity> wrapper);
	
	List<ShebeixiuliView> selectListView(@Param("ew") Wrapper<ShebeixiuliEntity> wrapper);

	List<ShebeixiuliView> selectListView(Pagination page,@Param("ew") Wrapper<ShebeixiuliEntity> wrapper);
	
	ShebeixiuliView selectView(@Param("ew") Wrapper<ShebeixiuliEntity> wrapper);
	
}
