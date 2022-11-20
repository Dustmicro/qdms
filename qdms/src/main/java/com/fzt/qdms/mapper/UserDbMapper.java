package com.fzt.qdms.mapper;


import com.fzt.qdms.dao.UserDb;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface UserDbMapper {
    int deleteByPrimaryKey(String userId);

    int insert(UserDb record);

    int insertSelective(UserDb record);

    UserDb selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(UserDb record);

    int updateByPrimaryKey(UserDb record);

    UserDb find(UserDb record);

    List<UserDb> list(UserDb record);

    List<UserDb> listAll();

    Page<UserDb> pageList(UserDb record);
}