package com.tour.resources.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tour.resources.dao.ResourcesDao;
import com.tour.resources.entity.Resources;
import com.tour.resources.service.ResourcesService;

/**
 * 
 * @author <Auto generate>
 * @version 2015-05-21 23:16:41
 * @see com.yang.spinach.service.impl.Resources
 */
@Service("resourcesService")
public class ResourcesServiceImpl implements ResourcesService {
	@Autowired
	private ResourcesDao resourcesDao;

	@Override
	public Integer saveResources(Resources entity) throws Exception {
		return resourcesDao.saveResources(entity);
	}

	@Override
	public Integer updateResourcesById(Resources entity) throws Exception {
		return resourcesDao.updateResourcesById(entity);
	}

	@Override
	public Resources selectResourcesById(Object id) throws Exception {
		return resourcesDao.selectResourcesById(id);
	}

	@Override
	public List<Resources> findByAccountId(Long id) throws Exception {
		return resourcesDao.findByAccountId(id);
	}

	@Override
	public List<Resources> list(Resources resource) {
		return resourcesDao.list(resource);
	}

}
