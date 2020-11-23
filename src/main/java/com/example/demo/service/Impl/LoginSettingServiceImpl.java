package com.example.demo.service.Impl;

import com.example.demo.dao.LoginSettingDao;
import com.example.demo.domain.LoginSettingSummary;
import com.example.demo.service.LoginSettingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginSettingServiceImpl implements LoginSettingService {
    private LoginSettingDao loginSettingDao;
    public LoginSettingServiceImpl(LoginSettingDao loginSettingDao){
        this.loginSettingDao=loginSettingDao;
    }


    @Override
    public List<LoginSettingSummary> getLoginSettingSummary(String userName, String passWord) {
        return loginSettingDao.getLoginSetting(userName,passWord);
    }
}
