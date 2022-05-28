package ainine9.com.github.spring_project.testapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ainine9.com.github.spring_project.testapp.accessors.UserInfo;
import ainine9.com.github.spring_project.testapp.interfaces.SearchServiceImpl;
import ainine9.com.github.spring_project.testapp.mapper.SearchMapper;

@Service
public class SeachService implements SearchServiceImpl{
    @Autowired
    private SearchMapper mapper;
    
    @Override
    public List<UserInfo> callService() {
        return mapper.selectUser();
    }
}
