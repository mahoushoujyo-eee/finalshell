/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.e3_0;

public class IT
implements e3_0 {
    private int L;

    public IT(int n10) {
        this.L = n10;
    }

    @Override
    public float H(float f10) {
        switch (this.L) {
            case 1: {
                return (float)Math.sin(f10);
            }
            case 2: {
                return (float)Math.cos(f10);
            }
            case 3: {
                return (float)Math.tan(f10);
            }
            case 4: {
                return (float)Math.sqrt(f10);
            }
            case -1: {
                return (float)Math.asin(f10);
            }
            case -2: {
                return (float)Math.acos(f10);
            }
            case -3: {
                return (float)Math.atan(f10);
            }
            case -4: {
                return f10 * f10;
            }
        }
        return f10;
    }
}

