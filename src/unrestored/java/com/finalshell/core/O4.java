package com.finalshell.core;

import com.finalshell.ui.model.EP;
import com.finalshell.ui.model.Ks2_2;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface O4 {
   boolean z() default true;

   String[] Z$arrString() default {};

   String[] y() default {};

   String[] Q() default {};

   EP[] u() default {};

   Ks2_2[] p() default {};

   boolean A() default true;

   java.lang.Class U() default Void.class;

   java.lang.Class F() default Void.class;

   String Z$String() default "";

   String W() default "";

   java.lang.Class[] w() default {};

   java.lang.Class c() default Void.class;

   java.lang.Class v() default Void.class;

   boolean q() default false;

   com.finalshell.ui.model.D n() default com.finalshell.ui.model.D.NeverUseThisValueExceptDefaultValue;

   java.lang.Class[] s() default {};

   java.lang.Class E() default WS3.class;
}





