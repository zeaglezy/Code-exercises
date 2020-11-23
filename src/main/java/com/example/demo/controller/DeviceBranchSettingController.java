package com.example.demo.controller;

import com.example.demo.domain.BranchSettingSummary;
import com.example.demo.service.DeviceBranchSettingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 网点布局控制器
 *
 * @author tanchena
 * @date 2020/9/25
 * @since 6.1.0
 */
@Api(value = "api/v1/device/branch-setting")
@RestController
@RequestMapping(value = "api/v1/device/branch-setting")
public class DeviceBranchSettingController {

	private DeviceBranchSettingService deviceBranchSettingService;

	public DeviceBranchSettingController(DeviceBranchSettingService deviceBranchSettingService) {
		this.deviceBranchSettingService = deviceBranchSettingService;
	}

	@ApiOperation(value = "查询网点布局摘要信息", notes = "查询网点布局摘要信息,支持按照机构号条件筛选,返回网点布局编号、名称数据集合")
	@ApiImplicitParam(name = "orgId", value = "机构编号", dataType = "string", paramType = "query", required = true)
	@GetMapping(value = "/summary", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<BranchSettingSummary> listBranchSettingSummary(
		@RequestParam(value = "orgId", required = true) String orgId) {
		return this.deviceBranchSettingService.listBranchSettingSummary(orgId);
	}

}
