/*
 * Decompiled with CFR 0.152.
 */
package com.I;

public final class L
extends Enum {
    public static final L jarEntry;
    public static final L packageEntry;
    public static final L classEntry;
    public static final L javaEntry;
    public static final L fileEntry;
    private static final /* synthetic */ L[] C;

    public static L[] values() {
        return (L[])C.clone();
    }

    public static L valueOf(String string) {
        return Enum.valueOf(L.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private L() {
        void var2_-1;
        void var1_-1;
    }

    private static /* synthetic */ L[] c() {
        return new L[]{jarEntry, packageEntry, classEntry, javaEntry, fileEntry};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[5];
                var4_1 = 0;
                var3_2 = "nHI\b\u0018}q[G^\u0011\u0000\ttH\\\u0002<t`lP\n}EK\u0010\n_zj[S";
                var5_3 = "nHI\b\u0018}q[G^\u0011\u0000\ttH\\\u0002<t`lP\n}EK\u0010\n_zj[S".length();
                var2_4 = 12;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 106;
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
                    var3_2 = "Bz|<\u0006NZVj\bNrb\u001c-T\\]";
                    var5_3 = "Bz|<\u0006NZVj\bNrb\u001c-T\\]".length();
                    var2_4 = 9;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 80;
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
                            v15 = 116;
                            break;
                        }
                        case 1: {
                            v15 = 67;
                            break;
                        }
                        case 2: {
                            v15 = 64;
                            break;
                        }
                        case 3: {
                            v15 = 9;
                            break;
                        }
                        case 4: {
                            v15 = 19;
                            break;
                        }
                        case 5: {
                            v15 = 112;
                            break;
                        }
                        default: {
                            v15 = 126;
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
        L.jarEntry = new L(var0[4], 0);
        L.packageEntry = new L(var0[0], 1);
        L.classEntry = new L(var0[2], 2);
        L.javaEntry = new L(var0[1], 3);
        L.fileEntry = new L(var0[3], 4);
        L.C = L.c();
    }
}

