/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.D;
import com.EP;
import com.ks_0;
import com.ws_1;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.TYPE})
public @interface O4 {
    public boolean z() default true;

    public String[] Z() default {};

    public String[] y() default {};

    public String[] Q() default {};

    public EP[] u() default {};

    public ks_0[] p() default {};

    public boolean A() default true;

    public Class U() default Void.class;

    public Class F() default Void.class;

    public String Z() default "";

    public String W() default "";

    public Class[] w() default {};

    public Class c() default Void.class;

    public Class v() default Void.class;

    public boolean q() default false;

    public D n() default D.NeverUseThisValueExceptDefaultValue;

    public Class[] s() default {};

    public Class E() default ws_1.class;
}

