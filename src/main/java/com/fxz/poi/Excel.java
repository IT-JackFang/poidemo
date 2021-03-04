package com.fxz.poi;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 描述：Excel注解
 *
 * @author Fang
 * @date 2021-02-08 08:46:30
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Excel {

    // 设置名称
    public String name() default "";

}
