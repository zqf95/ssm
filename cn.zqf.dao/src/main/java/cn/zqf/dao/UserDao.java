package cn.zqf.dao;

import cn.zqf.domain.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserDao {

    public List<User> findAll();
}
