/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.EP;
import com.ks_0;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
public @interface E6 {
    public int I() default 0;

    public String W() default "";

    public String q() default "";

    public boolean W() default true;

    public boolean Y() default true;

    public EP[] N() default {};

    public ks_0[] M() default {};

    public String Q() default "";

    public boolean i() default false;

    public Class u() default Void.class;

    public Class K() default Void.class;

    public String[] X() default {};

    public boolean t() default false;

    public String u() default "";
}

