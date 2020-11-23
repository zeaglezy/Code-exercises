package com.example.demo.dao;

import com.example.demo.domain.LoginSettingSummary;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface LoginSettingDao {



    List<LoginSettingSummary> getLoginSetting(@Param("userName")String userName,
                                                     @Param("passWord") String passWord);
}
