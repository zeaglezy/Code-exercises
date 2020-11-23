package com.example.demo.controller;

import com.example.demo.domain.BranchSettingSummary;
import com.example.demo.domain.LoginSettingSummary;
import com.example.demo.service.DeviceBranchSettingService;
import com.example.demo.service.LoginSettingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
public class LoginController {

    private LoginSettingService loginSettingService;

    public LoginController(LoginSettingService loginSettingService) {
        this.loginSettingService = loginSettingService;
    }

    @ApiOperation(value = "查询网点布局摘要信息", notes = "查询网点布局摘要信息,支持按照机构号条件筛选,返回网点布局编号、名称数据集合")
   @ApiImplicitParams({
           @ApiImplicitParam(name = "userName", value = "用户名", dataType = "string", paramType = "query", required = true),
           @ApiImplicitParam(name = "passWord",value = "密码",dataType = "string",paramType = "query",required = true)
   })
    @PostMapping(value = "/summary", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<LoginSettingSummary> listBranchSettingSummary(
            @RequestParam(value = "userName", required = true) String userName,
            @RequestParam(value = "passWord",required = true)String passWord)  {
        return this.loginSettingService.getLoginSettingSummary(userName,passWord);
    }

}
