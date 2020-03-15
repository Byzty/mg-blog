package org.mg.blog.blogadmin.service.impl;

import org.mg.blog.blogadmin.entity.UserVo;
import org.mg.blog.blogadmin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private static String USER_QUERY_SQL = "select user_name,pass from tbl_user where user_name = ? and pass = ?";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<UserVo> query(UserVo user) {
        return jdbcTemplate.query(USER_QUERY_SQL, (resultSet, i) -> {
            UserVo userVo = new UserVo();
            userVo.setUserName(resultSet.getString("user_name"));
            return userVo;
        }, user.getUserName(), user.getPass());
    }
}
