package com.zyq.pro;



import com.zyq.service.TestService;
import com.zyq.service.User;
import org.springframework.stereotype.Service;

@Service("testServiceImpl")
public class TestServiceImpl implements TestService{

    @Override
    public User get(User user) {
        // TODO Auto-generated method stub
        user.setName("zyq");
        return user;
    }
}
