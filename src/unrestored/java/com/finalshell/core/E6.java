package com.finalshell.core;

import com.finalshell.ui.model.EP;
import com.finalshell.ui.model.Ks2_2;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
public @interface E6 {
   int I() default 0;

   String W$String() default "";

   String q() default "";

   boolean W$boolean() default true;

   boolean Y() default true;

   EP[] N() default {};

   Ks2_2[] M() default {};

   String Q() default "";

   boolean i() default false;

   java.lang.Class u$Class() default Void.class;

   java.lang.Class K() default Void.class;

   String[] X() default {};

   boolean t() default false;

   String u$String() default "";
}





