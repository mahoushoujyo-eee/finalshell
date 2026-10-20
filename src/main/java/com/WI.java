/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.uS;

class WI {
    static final int[] f = new int[uS.values().length];

    static {
        try {
            WI.f[uS.Bash.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            WI.f[uS.Zsh.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

