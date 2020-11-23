package com.example.demo.dao;

import com.example.demo.domain.BranchSettingSummary;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 网点布局dao
 *
 * @author tanchena
 * @date 2020/9/25
 * @since 6.1.0
 */
@Mapper
public interface DeviceBranchSettingDao {

	/**
	 * 查询网点布局摘要信息
	 *
	 * @param orgId 机构编号
	 * @return 网点布局摘要信息集合
	 */
	List<BranchSettingSummary> listBranchSettingSummary(String orgId);

}
