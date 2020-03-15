package org.mg.blog.blogadmin.service;

import org.mg.blog.blogadmin.entity.UserVo;

import java.util.List;

/**
 * 系统用户服务
 */
public interface UserService {
    /**
     * 通过用户名与密码查询用户数
     * @param user 用户信息（用户名与密码）
     * @return 查询到的用户集
     */
    List<UserVo> query(UserVo user);
}
