package com.dao;

import com.entity.XiulijihuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiulijihuaVO;
import com.entity.view.XiulijihuaView;


/**
 * 修理计划
 * 
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
public interface XiulijihuaDao extends BaseMapper<XiulijihuaEntity> {
	
	List<XiulijihuaVO> selectListVO(@Param("ew") Wrapper<XiulijihuaEntity> wrapper);
	
	XiulijihuaVO selectVO(@Param("ew") Wrapper<XiulijihuaEntity> wrapper);
	
	List<XiulijihuaView> selectListView(@Param("ew") Wrapper<XiulijihuaEntity> wrapper);

	List<XiulijihuaView> selectListView(Pagination page,@Param("ew") Wrapper<XiulijihuaEntity> wrapper);
	
	XiulijihuaView selectView(@Param("ew") Wrapper<XiulijihuaEntity> wrapper);
	
}
