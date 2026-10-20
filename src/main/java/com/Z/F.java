/*
 * Decompiled with CFR 0.152.
 */
package com.Z;

import com.Z.T;
import com.cz_0;
import java.io.File;
import java.util.Comparator;

class F
implements Comparator {
    final T c;

    F(T t2) {
        this.c = t2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int C(File var1_1, File var2_2) {
        block15: {
            block14: {
                var4_3 = cz_0.z(var1_1);
                var5_4 = cz_0.z(var2_2);
                var3_5 = T.v();
                v0 = var4_3;
                if (var3_5 == null) {
                    if (v0 != 0) {
                        v0 = var5_4;
                        if (var3_5 == null) {
                            if (v0 != 0) {
                                return 0;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v0 = var4_3;
                    }
                }
                if (var3_5 == null) {
                    if (v0 != 0) {
                        return -1;
                    }
                    v0 = var5_4;
                }
                if (var3_5 != null) break block14;
                if (v0 == 0) break block15;
                v0 = 1;
            }
            return v0;
        }
        var6_6 = var1_1.length();
        var8_7 = var2_2.length();
        v1 = var6_6 == var8_7 ? 0 : (var6_6 < var8_7 ? -1 : 1);
        if (var3_5 != null) ** GOTO lbl31
        if (v1 < 0) {
            v1 = -1;
        } else {
            v1 = var6_6 == var8_7 ? 0 : (var6_6 < var8_7 ? -1 : 1);
lbl31:
            // 2 sources

            if (var3_5 == null) {
                v1 = v1 > 0 ? (long)1 : (long)0;
            }
        }
        return (int)v1;
    }

    public int compare(Object object, Object object2) {
        return this.C((File)object, (File)object2);
    }
}

