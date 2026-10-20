/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.pb_2;
import com.sf_0;

/*
 * Renamed from com.eL
 */
public final class el_1
extends Enum {
    public static final el_1 aboveStart;
    public static final el_1 aboveMiddle;
    public static final el_1 aboveEnd;
    public static final el_1 belowStart;
    public static final el_1 belowMiddle;
    public static final el_1 belowEnd;
    private static final el_1[] j;
    private static final long a;

    public static el_1[] values() {
        return (el_1[])j.clone();
    }

    public static el_1 valueOf(String string) {
        return Enum.valueOf(el_1.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private el_1() {
        void var2_-1;
        void var1_-1;
    }

    public int L() {
        int[] nArray = pb_2.g();
        int n10 = sf_0.s[this.ordinal()];
        if (nArray != null) {
            switch (n10) {
                case 1: 
                case 2: 
                case 3: {
                    return 3;
                }
            }
            n10 = 1;
        }
        return n10;
    }

    private static el_1[] R() {
        el_1[] el_1Array = new el_1[(int)a];
        el_1Array[0] = aboveStart;
        el_1Array[1] = aboveMiddle;
        el_1Array[2] = aboveEnd;
        el_1Array[3] = belowStart;
        el_1Array[4] = belowMiddle;
        el_1Array[5] = belowEnd;
        return el_1Array;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                var2 = new String[6];
                var6_1 = 0;
                var5_2 = "J\t'n\u001d\u0019\u0003J\u0019<\bI\u000e$w\u000f\u000f\u0019O\u000bI\u000e$w\u000f\u0007\u001eO\u000f$}\u000bJ\t'n\u001d\u0007\u001eO\u000f$}";
                var7_3 = "J\t'n\u001d\u0019\u0003J\u0019<\bI\u000e$w\u000f\u000f\u0019O\u000bI\u000e$w\u000f\u0007\u001eO\u000f$}\u000bJ\t'n\u001d\u0007\u001eO\u000f$}".length();
                var4_4 = 10;
                var3_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 69;
                    v1 = ++var3_5;
                    v2 = var5_2.substring(v1, v1 + var4_4);
                    v3 = -1;
                    break block20;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var2[var6_1++] = v4.intern();
                    if ((var3_5 += var4_4) < var7_3) {
                        var4_4 = var5_2.charAt(var3_5);
                        ** continue;
                    }
                    var5_2 = "-n@\tzh~(\n.iC\u0010h~d-~[";
                    var7_3 = "-n@\tzh~(\n.iC\u0010h~d-~[".length();
                    var4_4 = 8;
                    var3_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 34;
                        v5 = ++var3_5;
                        v2 = var5_2.substring(v5, v5 + var4_4);
                        v3 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var2[var6_1++] = v4.intern();
                    if ((var3_5 += var4_4) < var7_3) {
                        var4_4 = var5_2.charAt(var3_5);
                        ** continue;
                    }
                    break block21;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var8_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var8_6;
                while (true) {
                    switch (var8_6 % 7) {
                        case 0: {
                            v15 = 110;
                            break;
                        }
                        case 1: {
                            v15 = 46;
                            break;
                        }
                        case 2: {
                            v15 = 13;
                            break;
                        }
                        case 3: {
                            v15 = 93;
                            break;
                        }
                        case 4: {
                            v15 = 61;
                            break;
                        }
                        case 5: {
                            v15 = 15;
                            break;
                        }
                        default: {
                            v15 = 50;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var8_6;
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
            } while (v10 > var8_6);
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
lbl96:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 7357686248928909651L;
        ** while (true)
        el_1.a = 3819566261490096469L ^ var0_7;
        el_1.aboveStart = new el_1(var2[0], 0);
        el_1.aboveMiddle = new el_1(var2[3], 1);
        el_1.aboveEnd = new el_1(var2[4], 2);
        el_1.belowStart = new el_1(var2[5], 3);
        el_1.belowMiddle = new el_1(var2[2], 4);
        el_1.belowEnd = new el_1(var2[1], 5);
        el_1.j = el_1.R();
    }
}

