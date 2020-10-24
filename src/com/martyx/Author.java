package com.martyx;


import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME) //kedy v akom stadiu programu je anotacia dostupna
public @interface Author {
    String[] name();
    String date();
    String company() default "neviem";
}
