package com.fzt.qdms.service;

import com.fzt.qdms.dao.UserDb;
import com.fzt.qdms.mapper.UserDbMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户服务类
 * @author 黄弋峰
 */

@Service
public class UserService {

    @Autowired
    private UserDbMapper userDbMapper;

    /**
     * 全部查询
     * @return
     */
    public List<UserDb> listAll() {
        return userDbMapper.listAll();
    }
}
