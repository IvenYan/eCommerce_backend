package com.management.backend;

import io.swagger.annotations.Api;
import io.swagger.annotations.Authorization;

import java.lang.annotation.*;

/**
 * @ClassName ApiDemo
 * @Description TODO
 * @Author IvenYan
 * @Date 2019/9/15 9:26
 * @Version 1.0
 **/
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface ApiDemo {

        String value() default "";

        String[] tags() default {""};

        String produces() default "";

        String consumes() default "";

        String protocols() default "";

        Authorization[] authorizations() default {@Authorization("")};

        boolean hidden() default false;
}
