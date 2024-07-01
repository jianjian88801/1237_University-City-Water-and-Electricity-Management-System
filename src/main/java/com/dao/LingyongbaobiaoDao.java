package com.dao;

import com.entity.LingyongbaobiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LingyongbaobiaoVO;
import com.entity.view.LingyongbaobiaoView;


/**
 * 领用报表
 * 
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
public interface LingyongbaobiaoDao extends BaseMapper<LingyongbaobiaoEntity> {
	
	List<LingyongbaobiaoVO> selectListVO(@Param("ew") Wrapper<LingyongbaobiaoEntity> wrapper);
	
	LingyongbaobiaoVO selectVO(@Param("ew") Wrapper<LingyongbaobiaoEntity> wrapper);
	
	List<LingyongbaobiaoView> selectListView(@Param("ew") Wrapper<LingyongbaobiaoEntity> wrapper);

	List<LingyongbaobiaoView> selectListView(Pagination page,@Param("ew") Wrapper<LingyongbaobiaoEntity> wrapper);
	
	LingyongbaobiaoView selectView(@Param("ew") Wrapper<LingyongbaobiaoEntity> wrapper);
	
}
