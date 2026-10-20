/*
 * Decompiled with CFR 0.152.
 */
package com;

import com._e_0;

public final class QE
extends Enum {
    public static final QE roll;
    public static final QE star;
    public static final QE shutter;
    public static final QE fade;
    public static final QE list;
    private static final /* synthetic */ QE[] v;

    public static QE[] values() {
        return (QE[])v.clone();
    }

    public static QE valueOf(String string) {
        return Enum.valueOf(QE.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private QE() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean l() {
        int[] nArray = _e_0.P();
        QE qE = this;
        QE qE2 = roll;
        if (nArray == null) {
            if (qE == qE2) return true;
            qE = this;
            qE2 = star;
        }
        if (nArray == null) {
            if (qE == qE2) return true;
            qE = this;
            qE2 = shutter;
        }
        if (nArray == null) {
            if (qE == qE2) return true;
            qE = this;
            qE2 = fade;
        }
        if (qE != qE2) return false;
        return true;
    }

    public boolean V() {
        return this == list;
    }

    private static /* synthetic */ QE[] z() {
        return new QE[]{roll, star, shutter, fade, list};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[5];
                var4_1 = 0;
                var3_2 = "#\nH<\u0004\"\u0011E\"\u00047\u0004@5";
                var5_3 = "#\nH<\u0004\"\u0011E\"\u00047\u0004@5".length();
                var2_4 = 4;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 58;
                    v1 = ++var1_5;
                    v2 = var3_2.substring(v1, v1 + var2_4);
                    v3 = -1;
                    break block19;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v4.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
                        ** continue;
                    }
                    var3_2 = "Fi5@kcA\u0004Yh3@";
                    var5_3 = "Fi5@kcA\u0004Yh3@".length();
                    var2_4 = 7;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 94;
                        v5 = ++var1_5;
                        v2 = var3_2.substring(v5, v5 + var2_4);
                        v3 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v4.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
                        ** continue;
                    }
                    break block20;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var6_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v15 = 107;
                            break;
                        }
                        case 1: {
                            v15 = 95;
                            break;
                        }
                        case 2: {
                            v15 = 30;
                            break;
                        }
                        case 3: {
                            v15 = 106;
                            break;
                        }
                        case 4: {
                            v15 = 65;
                            break;
                        }
                        case 5: {
                            v15 = 88;
                            break;
                        }
                        default: {
                            v15 = 109;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var6_6;
                    v8 = v11;
                    if (v11 != 0) break;
                    v11 = v8;
                    v9 = v9;
                    v14 = v8;
                    v12 = v9;
                    v13 = v8;
                }
lbl85:
                // 2 sources

                v16 = v9;
                v10 = v10;
            } while (v10 > var6_6);
            v4 = new String(v16);
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl95:
                // 1 sources

                ** continue;
            }
        }
        QE.roll = new QE(var0[0], 0);
        QE.star = new QE(var0[1], 1);
        QE.shutter = new QE(var0[3], 2);
        QE.fade = new QE(var0[2], 3);
        QE.list = new QE(var0[4], 4);
        QE.v = QE.z();
    }
}

