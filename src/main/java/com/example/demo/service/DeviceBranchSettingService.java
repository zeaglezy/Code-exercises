package com.example.demo.service;


import com.example.demo.domain.BranchSettingSummary;

import java.util.List;

/**
 * 网点布局业务接口
 * @author tanchena
 * @date 2020/9/25
 * @since 6.1.0
 */
public interface DeviceBranchSettingService {

	/**
	 * 查询网点布局摘要信息
	 *
	 * @param orgId 机构编号
	 * @return 网点布局摘要信息集合
	 */
	List<BranchSettingSummary> listBranchSettingSummary(String orgId);

}
