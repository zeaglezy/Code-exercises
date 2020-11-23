package com.example.demo.service;

import com.example.demo.domain.LoginSettingSummary;

import java.util.List;

public interface LoginSettingService {


    List<LoginSettingSummary> getLoginSettingSummary(String userName, String passWord);
}
