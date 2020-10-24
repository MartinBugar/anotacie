package com.martyx;


import java.lang.annotation.Documented;

@Documented
public @interface Author {
    String name();
    String date();
    String company() default "neviem";
}
