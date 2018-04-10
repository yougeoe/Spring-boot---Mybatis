package com.bee.sample.service;

import com.bee.sample.domain.Entity.User;

import java.util.List;

public interface UserService {
    /** 新增 */
    int save(User User) throws Exception;
    /** 删除 */
    int del(Integer id) throws Exception;
    /** 更新 */
    int update(User user) throws Exception;
    /** 查询 */
    User findById(Integer id) throws Exception;
    /** 根据条件查询 */
    List<User> getList(User user) throws Exception;
}
