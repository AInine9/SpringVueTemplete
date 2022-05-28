package ainine9.com.github.spring_project.testapp.accessors;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ainine9.com.github.spring_project.testapp.interfaces.SearchServiceImpl;

@RestController
@CrossOrigin(origins = {"http://localhost:9000"})
public class SearchController {
    
    @Autowired
    private SearchServiceImpl service;

    @RequestMapping("/search")
    public List<UserInfo> search() {
        return service.callService();
    }
}
