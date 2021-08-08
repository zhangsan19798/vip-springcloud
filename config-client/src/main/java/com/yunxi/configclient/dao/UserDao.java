package com.yunxi.configclient.dao;

import com.yunxi.configclient.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public User findOne(Long id){
        String sql="select id,name,username,age from user where id = %d";
        sql = String.format(sql, id);
        return jdbcTemplate.queryForObject(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User user=new User();
                user.setId(resultSet.getLong("id"));
                user.setUsername(resultSet.getString("username"));
                user.setAge(resultSet.getShort("age"));
                user.setName(resultSet.getString("name"));
                return user;
            }
        });
    }
}
