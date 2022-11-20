package com.fzt.qdms.controller;

import com.fzt.qdms.dao.UserDb;
import com.fzt.qdms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/userDb")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询全部成员信息
     * @return
     */
    @ResponseBody
    @RequestMapping("/listAll")
    public List<UserDb> listAll(){
        return userService.listAll();
    }
}
