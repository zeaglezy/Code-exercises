package com.example.demo.service.Impl;


import com.example.demo.dao.DeviceBranchSettingDao;
import com.example.demo.domain.BranchSettingSummary;
import com.example.demo.service.DeviceBranchSettingService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 网点布局业务接口实现类
 *
 * @author tanchena
 * @date 2020/9/25
 * @since 6.1.0
 */
@Service
public class DeviceBranchSettingServiceImpl implements DeviceBranchSettingService {

	private DeviceBranchSettingDao branchSettingDao;

	public DeviceBranchSettingServiceImpl(DeviceBranchSettingDao branchSettingDao) {
		this.branchSettingDao = branchSettingDao;
	}

	@Override
	public List<BranchSettingSummary> listBranchSettingSummary(String orgId) {
		return this.branchSettingDao.listBranchSettingSummary(orgId);
	}
}
