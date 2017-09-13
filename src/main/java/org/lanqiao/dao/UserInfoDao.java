package org.lanqiao.dao;

import java.util.List;

import org.lanqiao.entity.UserInfo;

public interface UserInfoDao {
    int deleteByPrimaryKey(Integer userId);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
    
    List<UserInfo> selectAllUser();
    
    
}