/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.S6;
import com.hi_0;
import com.ph_2;
import com.z8;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Renamed from com.zz
 */
class zz_0
extends z8 {
    private final Pattern m;
    private final S6 c;

    public zz_0(String string, boolean bl, Pattern pattern, S6 s6) {
        super(string, bl);
        this.m = pattern;
        this.c = s6;
    }

    @Override
    public boolean x(ph_2 ph_22, Object object, Object object2, Object object3) {
        Object object4;
        block4: {
            Object object5;
            block5: {
                object5 = this.H(ph_22, object, object3);
                String string = hi_0.C();
                try {
                    try {
                        object4 = object5;
                        if (string != null) break block4;
                        if (object4 != null) break block5;
                    }
                    catch (hi_0 hi_02) {
                        throw zz_0.a(hi_02);
                    }
                    return false;
                }
                catch (hi_0 hi_03) {
                    throw zz_0.a(hi_03);
                }
            }
            object4 = object5;
        }
        String string = object4.toString();
        Matcher matcher = this.m.matcher(string);
        return matcher.matches();
    }

    private static hi_0 a(hi_0 hi_02) {
        return hi_02;
    }
}

