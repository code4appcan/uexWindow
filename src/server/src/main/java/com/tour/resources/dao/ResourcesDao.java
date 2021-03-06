package com.tour.resources.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.tour.resources.entity.Resources;
import com.tour.resources.entity.SysRole;

/**
 * 
 * @author <Auto generate>
 * @version 2015-05-21 23:16:41
 * @see com.yang.spinach.dao.Resources
 */
@Repository
public interface ResourcesDao {
	/**
	 * 保存
	 *
	 */
	public Integer saveResources(Resources entity) throws Exception;

	/**
	 * 修改
	 *
	 */
	public Integer updateResourcesById(Resources entity) throws Exception;

	/**
	 * 根据ID查找
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	Resources selectResourcesById(Object id) throws Exception;

	List<Resources> findByAccountId(Long id) throws Exception;

	List<Resources> list(@Param("resource") Resources resource);

	List<Resources> getResourcesByRole(@Param("roles") List<SysRole> roles);
}
