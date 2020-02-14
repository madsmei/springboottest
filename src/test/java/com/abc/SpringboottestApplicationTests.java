package com.abc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class SpringboottestApplicationTests {

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Test
    void testRedis(){
        redisTemplate.opsForValue();
    }
    @Test
    void contextLoads() {
    }

}
