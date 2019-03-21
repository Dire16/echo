package com.geely.echo.web;

import com.geely.echo.mapper.HeroavatarMapper;
import com.geely.echo.pojo.Heroavatar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class hello {
    @Autowired
    HeroavatarMapper heroavatarMapper;
    @RequestMapping("/hello")
    public String hello() {
        List<Heroavatar> users=heroavatarMapper.findAll();
        return users.get(0).toString();
    }
}
