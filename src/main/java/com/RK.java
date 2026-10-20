/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.RA;
import com.RO;
import com.rs_0;
import java.util.List;

public abstract class RK
extends Enum {
    public static final RK system;
    public static final RK drives;
    public static final RK userHome;
    private static final RK[] K;

    public static RK[] values() {
        return (RK[])K.clone();
    }

    public static RK valueOf(String string) {
        return Enum.valueOf(RK.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private RK() {
        void var2_-1;
        void var1_-1;
    }

    public abstract List I();

    private static RK[] v() {
        return new RK[]{system, drives, userHome};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    RK() {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "O;U\u0012T5\u0006X0O\u0010T+\b^:Y\u0016y)=N";
            var5_3 = "O;U\u0012T5\u0006X0O\u0010T+\b^:Y\u0016y)=N".length();
            var2_4 = 6;
            var1_5 = -1;
lbl7:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                var0[var4_1++] = new String(v0).intern();
                if ((var1_5 += var2_4) < var5_3) {
                    var2_4 = var3_2.charAt(var1_5);
                    ** continue;
                }
                break block13;
                break;
            }
            v1 = ++var1_5;
            v2 = var3_2.substring(v1, v1 + var2_4).toCharArray();
            v3 = v2.length;
            var6_6 = 0;
            v4 = 15;
            v5 = v2;
            v6 = v3;
            if (v3 > 1) ** GOTO lbl67
            do {
                v7 = v4;
                v5 = v5;
                v8 = v5;
                v9 = v4;
                v10 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v11 = 36;
                            break;
                        }
                        case 1: {
                            v11 = 70;
                            break;
                        }
                        case 2: {
                            v11 = 51;
                            break;
                        }
                        case 3: {
                            v11 = 107;
                            break;
                        }
                        case 4: {
                            v11 = 62;
                            break;
                        }
                        case 5: {
                            v11 = 73;
                            break;
                        }
                        default: {
                            v11 = 95;
                        }
                    }
                    v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                    ++var6_6;
                    v4 = v7;
                    if (v7 != 0) break;
                    v7 = v4;
                    v5 = v5;
                    v10 = v4;
                    v8 = v5;
                    v9 = v4;
                }
lbl67:
                // 2 sources

                v0 = v5;
                v6 = v6;
            } while (v6 > var6_6);
            ** while (true)
        }
        RK.system = new RA();
        RK.drives = new RO();
        RK.userHome = new rs_0();
        RK.K = RK.v();
    }
}

