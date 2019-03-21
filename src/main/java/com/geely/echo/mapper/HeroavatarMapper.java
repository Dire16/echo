package com.geely.echo.mapper;

import com.geely.echo.pojo.Heroavatar;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface HeroavatarMapper {
    @Select("select * from heroavatar ")
    List<Heroavatar> findAll();
}
