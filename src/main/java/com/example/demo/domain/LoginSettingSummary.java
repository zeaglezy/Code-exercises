package com.example.demo.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@ApiModel(value = "LoginSettingSummary", description = "设备信息实体")
@Data
@NoArgsConstructor
public class LoginSettingSummary {
    @ApiModelProperty(value = "用户Id")
    private Integer id;

    @ApiModelProperty(value = "用户名", required = true)
    @NotNull
    private String userName;

    @ApiModelProperty(value = "密码", required = true)
    @NotNull
    private String passWord;

}