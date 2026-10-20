/*
 * Decompiled with CFR 0.152.
 */
package com;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.TYPE})
public @interface _2 {
    public String p() default "build";

    public String A() default "with";
}

