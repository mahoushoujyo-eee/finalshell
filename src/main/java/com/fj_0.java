/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/*
 * Renamed from com.Fj
 */
@XStreamAlias(value="NinePatchIntervalType")
public final class fj_0
extends Enum {
    public static final fj_0 horizontalStretch;
    public static final fj_0 verticalStretch;
    public static final fj_0 horizontalContent;
    public static final fj_0 verticalContent;
    private static final /* synthetic */ fj_0[] K;

    public static fj_0[] values() {
        return (fj_0[])K.clone();
    }

    public static fj_0 valueOf(String string) {
        return Enum.valueOf(fj_0.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private fj_0() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ fj_0[] m() {
        return new fj_0[]{horizontalStretch, verticalStretch, horizontalContent, verticalContent};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[4];
                var4_1 = 0;
                var3_2 = "tTd'\u001d9Mnry=\u0000?Bv\u000ftTd'\u001d9Mnbb!\u0011.Oj";
                var5_3 = "tTd'\u001d9Mnry=\u0000?Bv\u000ftTd'\u001d9Mnbb!\u0011.Oj".length();
                var2_4 = 15;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 76;
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
                    var3_2 = "!\u0015/qE~\t=\u001b1[P\u007f\u0013,\u0014)\u0011!\u0015/qE~\t=\u001b1KKc\u0002=\u00195";
                    var5_3 = "!\u0015/qE~\t=\u001b1[P\u007f\u0013,\u0014)\u0011!\u0015/qE~\t=\u001b1KKc\u0002=\u00195".length();
                    var2_4 = 17;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 7;
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
                            v15 = 78;
                            break;
                        }
                        case 1: {
                            v15 = 125;
                            break;
                        }
                        case 2: {
                            v15 = 90;
                            break;
                        }
                        case 3: {
                            v15 = 31;
                            break;
                        }
                        case 4: {
                            v15 = 56;
                            break;
                        }
                        case 5: {
                            v15 = 22;
                            break;
                        }
                        default: {
                            v15 = 96;
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
        fj_0.horizontalStretch = new fj_0(var0[3], 0);
        fj_0.verticalStretch = new fj_0(var0[1], 1);
        fj_0.horizontalContent = new fj_0(var0[2], 2);
        fj_0.verticalContent = new fj_0(var0[0], 3);
        fj_0.K = fj_0.m();
    }
}

