package com.martyx;


import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME) //kedy v akom stadiu programu je anotacia dostupna
public @interface Author {
    String[] name();
    String date();
    String company() default "neviem";
}
