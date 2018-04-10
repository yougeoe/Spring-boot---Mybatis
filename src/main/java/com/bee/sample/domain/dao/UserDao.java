package com.bee.sample.domain.dao;

import com.bee.sample.domain.Entity.User;

import java.util.List;

public interface UserDao {
    /** 新增 */
    int insert(User User) throws Exception;
    /** 删除 */
    int del(Integer id) throws Exception;
    /** 更新 */
    int update(User user) throws Exception;
    /** 查询 */
    User get(Integer id) throws Exception;
    /** 根据条件查询 */
    List<User> getList(User user) throws Exception;

}
