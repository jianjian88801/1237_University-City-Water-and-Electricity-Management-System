package com.dao;

import com.entity.ZhuangtaihuibaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuangtaihuibaoVO;
import com.entity.view.ZhuangtaihuibaoView;


/**
 * 状态汇报
 * 
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
public interface ZhuangtaihuibaoDao extends BaseMapper<ZhuangtaihuibaoEntity> {
	
	List<ZhuangtaihuibaoVO> selectListVO(@Param("ew") Wrapper<ZhuangtaihuibaoEntity> wrapper);
	
	ZhuangtaihuibaoVO selectVO(@Param("ew") Wrapper<ZhuangtaihuibaoEntity> wrapper);
	
	List<ZhuangtaihuibaoView> selectListView(@Param("ew") Wrapper<ZhuangtaihuibaoEntity> wrapper);

	List<ZhuangtaihuibaoView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuangtaihuibaoEntity> wrapper);
	
	ZhuangtaihuibaoView selectView(@Param("ew") Wrapper<ZhuangtaihuibaoEntity> wrapper);
	
}
