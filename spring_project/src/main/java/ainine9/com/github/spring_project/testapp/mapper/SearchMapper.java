package ainine9.com.github.spring_project.testapp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ainine9.com.github.spring_project.testapp.accessors.UserInfo;

@Mapper
public interface SearchMapper {
    List<UserInfo> selectUser();
}
