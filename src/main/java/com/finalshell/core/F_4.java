package com.finalshell.core;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.LOCAL_VARIABLE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
@Retention(RetentionPolicy.CLASS)
public @interface F_4 {
   boolean value() default true;
}





