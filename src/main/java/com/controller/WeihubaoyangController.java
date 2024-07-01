package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.WeihubaoyangEntity;
import com.entity.view.WeihubaoyangView;

import com.service.WeihubaoyangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 维护保养
 * 后端接口
 * @author 
 * @email 
 * @date 2021-05-09 14:14:43
 */
@RestController
@RequestMapping("/weihubaoyang")
public class WeihubaoyangController {
    @Autowired
    private WeihubaoyangService weihubaoyangService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WeihubaoyangEntity weihubaoyang,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date weihuriqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date weihuriqiend,
		HttpServletRequest request){
        EntityWrapper<WeihubaoyangEntity> ew = new EntityWrapper<WeihubaoyangEntity>();
		if(weihuriqistart!=null) ew.ge("weihuriqi", weihuriqistart);
        	if(weihuriqiend!=null) ew.le("weihuriqi", weihuriqiend);
		PageUtils page = weihubaoyangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, weihubaoyang), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WeihubaoyangEntity weihubaoyang, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date weihuriqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date weihuriqiend,
		HttpServletRequest request){
        EntityWrapper<WeihubaoyangEntity> ew = new EntityWrapper<WeihubaoyangEntity>();
                if(weihuriqistart!=null) ew.ge("weihuriqi", weihuriqistart);
                if(weihuriqiend!=null) ew.le("weihuriqi", weihuriqiend);
		PageUtils page = weihubaoyangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, weihubaoyang), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WeihubaoyangEntity weihubaoyang){
       	EntityWrapper<WeihubaoyangEntity> ew = new EntityWrapper<WeihubaoyangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( weihubaoyang, "weihubaoyang")); 
        return R.ok().put("data", weihubaoyangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WeihubaoyangEntity weihubaoyang){
        EntityWrapper< WeihubaoyangEntity> ew = new EntityWrapper< WeihubaoyangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( weihubaoyang, "weihubaoyang")); 
		WeihubaoyangView weihubaoyangView =  weihubaoyangService.selectView(ew);
		return R.ok("查询维护保养成功").put("data", weihubaoyangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WeihubaoyangEntity weihubaoyang = weihubaoyangService.selectById(id);
        return R.ok().put("data", weihubaoyang);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WeihubaoyangEntity weihubaoyang = weihubaoyangService.selectById(id);
        return R.ok().put("data", weihubaoyang);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WeihubaoyangEntity weihubaoyang, HttpServletRequest request){
    	weihubaoyang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(weihubaoyang);
        weihubaoyangService.insert(weihubaoyang);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WeihubaoyangEntity weihubaoyang, HttpServletRequest request){
    	weihubaoyang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(weihubaoyang);
        weihubaoyangService.insert(weihubaoyang);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody WeihubaoyangEntity weihubaoyang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(weihubaoyang);
        weihubaoyangService.updateById(weihubaoyang);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        weihubaoyangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<WeihubaoyangEntity> wrapper = new EntityWrapper<WeihubaoyangEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = weihubaoyangService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
