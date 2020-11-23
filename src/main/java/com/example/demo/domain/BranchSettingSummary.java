package com.example.demo.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 网点布局摘要信息实体
 * @author tanchena
 * @date 2020/9/25
 * @since 6.1.0
 */
@ApiModel(value = "BranchSettingSummary", description = "网点布局摘要信息实体")
@Data
@NoArgsConstructor
public class BranchSettingSummary {

	@ApiModelProperty(value = "网点布局id")
	private String orgId;

	@ApiModelProperty(value = "区域id")
	private String userName;

	@ApiModelProperty(value = "区域名称")
	private String passWord;


}
