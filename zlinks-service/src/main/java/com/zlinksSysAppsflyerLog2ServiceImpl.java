package com.zlinks.zlinks-service.impl;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import com.zlinks.entity.SysAppsflyerLog2;
import com.zlinks.zlinks-service.SysAppsflyerLog2Service;
import com.zlinks.zlinks-repsitory.SysAppsflyerLog2Dao;
import java.util.List;
import java.util.Map;

import com.hpxs.base.BaseMybatisDao;
import com.zlinks.core.mybatis.page.Pagination;

/**
 * 类说明:
 *
 * Created by noname on 2018-7-7 15:28:42
 */
@Service("sysAppsflyerLog2Service")
public class SysAppsflyerLog2ServiceImpl extends BaseMybatisDao<SysAppsflyerLog2Dao> implements SysAppsflyerLog2Service {

	@Autowired
	private SysAppsflyerLog2Dao sysAppsflyerLog2Dao;

	@Override
	public SysAppsflyerLog2 getById(int id) {
		return sysAppsflyerLog2Dao.getById(id);
	}

	@Override
	public int getListCount(SysAppsflyerLog2 entity) {
		return sysAppsflyerLog2Dao.getListCount(entity);
	}

	@Override
	public List<SysAppsflyerLog2> getList(SysAppsflyerLog2 entity) {
		List<SysAppsflyerLog2> resut = null;
		resut = sysAppsflyerLog2Dao.getList(entity);
		return resut;
	}

	@Override
	public int getListByMapCount(Map<String, Object> paramMap) {
		return sysAppsflyerLog2Dao.getListByMapCount(paramMap);
	}

	@Override
	public List<SysAppsflyerLog2> getListByMap(Map<String, Object> paramMap) {
		List<SysAppsflyerLog2> resut = null;
		resut = sysAppsflyerLog2Dao.getListByMap(paramMap);
		return resut;
	}

	@Override
	public int update(SysAppsflyerLog2 entity) {
		return sysAppsflyerLog2Dao.update(entity);
	}

	@Override
	public int deleteById(int id) {
		return sysAppsflyerLog2Dao.deleteById(id);
	}

	@Override
	public int add(SysAppsflyerLog2 entity) {
		return sysAppsflyerLog2Dao.add(entity);
	}

	@Override
	public int addList(List<SysAppsflyerLog2> entityList) {
		return sysAppsflyerLog2Dao.addList(entityList);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Pagination<SysAppsflyerLog2> findPage(Map<String,Object> paramMap, Integer pageNo,
			Integer pageSize) {
		return super.findPage(paramMap, pageNo, pageSize);
	}

	@Override
	public List<SysAppsflyerLog2> getActivedList() {
		List<SysAppsflyerLog2> resut = null;
		SysAppsflyerLog2 entity = new SysAppsflyerLog2();
		entity.setIsDeleted(0);
		resut = sysAppsflyerLog2Dao.getList(entity);
		return resut;
	}
}