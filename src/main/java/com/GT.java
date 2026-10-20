/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.ph_0;
import com.wh_0;
import java.util.Arrays;

public class GT {
    private final wh_0[] E;
    private final int H;
    private static final long a;

    public GT() {
        this((int)a);
    }

    public GT(int n10) {
        this.H = n10 - 1;
        this.E = new wh_0[n10];
    }

    public final Object B(Object object) {
        int n10 = System.identityHashCode(object);
        int n11 = n10 & this.H;
        wh_0 wh_02 = this.E[n11];
        while (wh_02 != null) {
            if (object == wh_02.k) {
                return wh_02.g;
            }
            wh_02 = wh_02.n;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    public Class L(String var1_1) {
        var3_2 = 0;
        var2_3 = ph_0.w();
        block0: while (true) {
            v0 = var3_2;
            block1: while (v0 < this.E.length) {
                block12: {
                    block11: {
                        v1 = var4_4 = this.E[var3_2];
                        if (var2_3 == 0) break block11;
                        if (v1 == null && var2_3 != 0) break block12;
                        v1 = var5_5 = var4_4;
                    }
                    while (var5_5 != null) {
                        var6_6 = var4_4.k;
                        if (var2_3 != 0) {
                            v0 = var6_6 instanceof Class;
                            if (var2_3 == 0) continue block1;
                            if (v0 != 0) {
                                var7_7 = (Class)var6_6;
                                var8_8 = var7_7.getName();
                                if (var2_3 != 0) {
                                    if (var8_8.equals(var1_1)) {
                                        return var7_7;
                                    } else {
                                        ** GOTO lbl-1000
                                    }
                                }
                            } else lbl-1000:
                            // 3 sources

                            {
                                var5_5 = var5_5.n;
                            }
                        }
                        if (var2_3 != 0) continue;
                    }
                }
                ++var3_2;
                if (var2_3 != 0) continue block0;
            }
            break;
        }
        return null;
    }

    public boolean k(Object object, Object object2) {
        int n10 = System.identityHashCode(object);
        int n11 = n10 & this.H;
        wh_0 wh_02 = this.E[n11];
        while (wh_02 != null) {
            if (object == wh_02.k) {
                wh_02.g = object2;
                return true;
            }
            wh_02 = wh_02.n;
        }
        this.E[n11] = wh_02 = new wh_0(object, object2, n10, this.E[n11]);
        return false;
    }

    public void f() {
        Arrays.fill(this.E, null);
    }

    public int W() {
        int n10 = 0;
        wh_0[] wh_0Array = this.E;
        int n11 = wh_0Array.length;
        int n12 = ph_0.w();
        int n13 = 0;
        while (n13 < n11) {
            block3: {
                wh_0 wh_02 = wh_0Array[n13];
                while (wh_02 != null) {
                    ++n10;
                    wh_02 = wh_02.n;
                    if (n12 != 0) {
                        if (n12 != 0) continue;
                    }
                    break block3;
                }
                ++n13;
            }
            if (n12 != 0) continue;
        }
        return n10;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 7951510104169158591L;
        a = 0x58FCF00992EEB7BFL ^ l2;
    }
}

