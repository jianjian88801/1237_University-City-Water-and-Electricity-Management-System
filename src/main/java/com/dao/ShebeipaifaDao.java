package com.dao;

import com.entity.ShebeipaifaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShebeipaifaVO;
import com.entity.view.ShebeipaifaView;


/**
 * 设备派发
 * 
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
public interface ShebeipaifaDao extends BaseMapper<ShebeipaifaEntity> {
	
	List<ShebeipaifaVO> selectListVO(@Param("ew") Wrapper<ShebeipaifaEntity> wrapper);
	
	ShebeipaifaVO selectVO(@Param("ew") Wrapper<ShebeipaifaEntity> wrapper);
	
	List<ShebeipaifaView> selectListView(@Param("ew") Wrapper<ShebeipaifaEntity> wrapper);

	List<ShebeipaifaView> selectListView(Pagination page,@Param("ew") Wrapper<ShebeipaifaEntity> wrapper);
	
	ShebeipaifaView selectView(@Param("ew") Wrapper<ShebeipaifaEntity> wrapper);
	
}
