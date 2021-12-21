package com.leaf.community;

import com.leaf.community.dao.UserMapper;
import com.leaf.community.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
class CommunityApplicationTests {

	@Autowired
	private UserMapper userMapper;



}
