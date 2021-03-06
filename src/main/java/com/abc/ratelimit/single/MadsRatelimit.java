package com.abc.ratelimit.single;

import java.lang.annotation.*;

/**
 * @Description: 单机版 一个 令牌桶的注解
 * @Date 2020/2/13
 * @Version V1.0
 * @Author Mads
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MadsRatelimit {
    //最大的限流数量
    double limit() default 1.0;

    //超时时间
    int timeout() default 1;

    //处理降级的方法名
    String fallback() default "fallbackMethod";
}
